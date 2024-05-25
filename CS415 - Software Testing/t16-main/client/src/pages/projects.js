import { useEffect, useState } from 'react'
import ClickList from '../components/ClickList'
import { getProjects, getWorkers, createProject, getQualifications, assignWorker, unassignWorker, startProject, finishProject} from '../services/dataService'
import LocationID from '../utils/location'
import { pageStyle } from '../utils/styles'
import Select from 'react-select'

const Project = (project, active) => {
    return (
        <div>
            <div>{project.name}</div>
            {active === true ? ProjectBody(project) : null}
        </div>
    )
}

const qualMap = (qualifications) => {
    return (
        qualifications.map((qual, index) => (
            <span key={index}>
                {qual}{index !== qualifications.length - 1 && ", "}
            </span>
        ))
    )
}

const ProjectBody = (project) => {

    const startProj = () => {
        let req = {
            "name": project.name,
        } 
        startProject(req)
            .then(() => {
                alert("Project started");
                project.status = "ACTIVE"
        })
    }

    const finishProj = () => {
        let req = {
            "name": project.name,
        }
        finishProject(req)
            .then(() => {
                alert("Project finished");
                project.status = "FINISHED"
                project.workers = ""
                project.missingQualifications = project.qualifications
        })
    }

    return (     
        <div>
            <p>Name: {project.name}</p>
            <p>Size: {project.size}</p>
            <p>Workers: {project.workers.length > 0 ? project.workers.map((worker, index) => (
                <span key={index}>
                    {worker}{index !== project.workers.length - 1 && ", "}
                </span>
            )) : "None"}</p>
            <p>Required Qualifications: {qualMap(project.qualifications)}</p>
            <p>Missing Qualifications: {project.missingQualifications.length > 0 ? qualMap(project.missingQualifications) : "None"}</p>
            <p>Status: {project.status} </p>
            {(project.status == 'PLANNED' || project.status == 'SUSPENDED') && project.missingQualifications.length == 0 ?  <button onClick={startProj}> Start Project </button> : ""}
            {project.status == "ACTIVE" ? <button onClick={finishProj}> Finish Project </button> : ""}
        </div>
    )
}

const Helpful = (worker,project) => { // helper method for worker filtering
    if (!worker || !project || !project.value || !project.value.missingQualifications) {
        return false;
    }
    for (let i = 0; i < worker.qualifications.length; i++) {
        const qualification = worker.qualifications[i];
        if(project.value.missingQualifications.includes(qualification)){
            return true;
        }
    }
    return false;
}

const Projects = () => {
    const [projects, setProjects] = useState([])
    useEffect(() => { getProjects().then(setProjects) }, [])

    const [qualifications, setQualifications] = useState([])
    useEffect(() => { getQualifications().then(setQualifications) }, [])

    const [selectedQuals, setSelectedQuals] = useState(null);
    const [projectName, setProjectName] = useState("");
    const [projectSize, setProjectSize] = useState("");

    const active = LocationID('projects', projects, 'name')
    const options = []
    qualifications.forEach(qual => {
        options.push({value: qual.description, label: qual.description})
    })

    const sizeOptions = [
        { value: 'SMALL', label: 'Small' },
        { value: 'MEDIUM', label: 'Medium' },
        { value: 'BIG', label: 'Big' }
    ];

    //everything below is used for assign
    const [assProject, setAssProject] = useState("") 
    const [assWorker, setAssWorker] = useState("")
    const [unassProject, setUnassProject] = useState("") 
    const [unassWorker, setUnassWorker] = useState("")

    const [workers, setWorkers] = useState([])
    useEffect(() => { getWorkers().then(setWorkers) }, [])

    const [availableProjects, setAvailableProjects] = useState([]); // filtering out incorrect state and no missing qual projects
    useEffect(() => {
        const filteredProjects = projects.filter(project => project.status !== "ACTIVE" && project.status !== "FINISHED");
        const filterProj2 = filteredProjects.filter( project => project.missingQualifications.length !== 0);
        setAvailableProjects(filterProj2)
    }, [projects]);

    const [availableProjectsRemove, setavailableProjectsRemove] = useState([]); // filtering out projects with no workers
    useEffect(() => {
        const filteredProjectsU = projects.filter(project => project.workers.length > 0);
        setavailableProjectsRemove(filteredProjectsU)
    }, [projects]);

    const [availableWorkers, setAvailableWorkers] = useState([]); //filtering out overloaded and unhelpful workers
    useEffect(() => {
        if (assProject.size === "SMALL") {
            const filterOL = workers.filter(worker => worker.workload + 1 <= 12);
            const filterHelpful = filterOL.filter(worker => Helpful(worker,assProject));
            setAvailableWorkers(filterHelpful);
        }else if(assProject.size === "MEDIUM"){
            const filterOL = workers.filter(worker => worker.workload + 2 <= 12);
            const filterHelpful = filterOL.filter(worker => Helpful(worker,assProject));
            setAvailableWorkers(filterHelpful);
        }else{
            const filterOL = workers.filter(worker => worker.workload + 3 <= 12);
            const filterHelpful = filterOL.filter(worker => Helpful(worker,assProject));
            setAvailableWorkers(filterHelpful);
        }
        setAssWorker("");
    }, [assProject]);

    const [availableWorkersRemove, setAvailableWorkersRemove] = useState([]); //filtering out workers not assigned to the project
    useEffect(() => {
        const filterWFC = workers.filter(worker => worker.projects.includes(unassProject.label));
        setAvailableWorkersRemove(filterWFC);
        setUnassWorker("");
    }, [unassProject]);

    const workerOptions = availableWorkers.map(worker => ({
        value: worker.name,
        label: worker.name
    }));

    const projectOptions = availableProjects.map(project => ({
        value: project,
        label: project.name
    }));

    const workerOptionsRemove = availableWorkersRemove.map(worker => ({
        value: worker.name,
        label: worker.name
    }));

    const projectOptionsRemove = availableProjectsRemove.map(project => ({
        value: project,
        label: project.name
    }));

    return (
        <div style={pageStyle}>
            <div className='addWorker'>
                <input 
                    name='name' 
                    id='newProjectName' 
                    placeholder={"Project Name"} 
                    value={projectName}
                    onChange={e => setProjectName(e.target.value)}/>
                <Select
                    className='multi-select'
                    closeMenuOnSelect={false}
                    isMulti
                    placeholder="Required Qualifications"
                    value={selectedQuals}
                    defaultValue={selectedQuals}
                    onChange={setSelectedQuals}
                    options={options}
                />
                <Select
                    className='size-select'
                    placeholder="Select Project Size"
                    value={projectSize}
                    onChange={setProjectSize}
                    options={sizeOptions}
                />
                <button
                    id='createProject'
                    onClick={() => {
                        let quals = selectedQuals.map(qual => qual.value)
                        let size = projectSize.value
                        let req = {
                            "name": projectName,
                            "qualifications": quals,
                            "size": size,
                        } 
                        createProject(req)
                        .then(() => {
                            getProjects()
                            .then(newProjects => {
                                setProjects(newProjects);
                            })
                        })
                        setProjectName('')
                        setSelectedQuals('[]')
                        setProjectSize('')
                    }}
                    disabled={
                        !(projectName !== "" && projectSize && selectedQuals)
                    }>
                Create Project</button>
            </div>

            <ClickList active={active} list={projects} item={Project} path='/projects' id='name' />
            <div><h3>Assign a worker</h3></div>
            <div className='addWorker'>
                <Select
                    className='assignProj'
                    placeholder="Choose a Project"
                    options={projectOptions}
                    value ={assProject}
                    onChange={setAssProject}
                />
                <Select
                    className='assignWork'
                    placeholder="Choose a Worker"
                    options={workerOptions}
                    value ={assWorker}
                    onChange={setAssWorker}
                />
                <button
                    id='assign'
                    onClick={() => {
                        let projName = assProject.value.name;
                        let workerName = assWorker.value;
                        let req = {
                            "worker": workerName,
                            "project": projName,
                        } 
                        assignWorker(req)
                        .then(() => {
                            getProjects()
                            .then(newProjects => {
                                setProjects(newProjects);
                            })
                            getWorkers()
                            .then(newWorkers => {
                                setWorkers(newWorkers);
                            })
                            setAssProject('')
                            setAssWorker('')
                        })
                    }}
                    disabled={
                        !(assProject && assWorker)
                    }>
                Assign</button>
            </div>

            <div><h3>Unassign a worker</h3></div>
            <div className='addWorker'>
                <Select
                    className='unassignProj'
                    placeholder="Choose a Project"
                    options={projectOptionsRemove}
                    value ={unassProject}
                    onChange={setUnassProject}
                />
                <Select
                    className='unassignWork'
                    placeholder="Choose a Worker"
                    options={workerOptionsRemove}
                    value ={unassWorker}
                    onChange={setUnassWorker}
                />
                <button
                    id='unassign'
                    onClick={() => {
                        let projNameUnassign = unassProject.value.name;
                        let workerNameUnassign = unassWorker.value;
                        let req = {
                            "worker": workerNameUnassign,
                            "project": projNameUnassign,
                        } 
                        unassignWorker(req)
                        .then(() => {
                            getProjects()
                            .then(newProjects => {
                                setProjects(newProjects);
                            })
                            getWorkers()
                            .then(newWorkers => {
                                setWorkers(newWorkers);
                            })
                            setUnassProject('')
                            setUnassWorker('')
                        })
                    }}
                    disabled={
                        !(unassProject && unassWorker)
                    }>
                Unassign</button>
            </div>
            
        </div>
    )
}

export default Projects