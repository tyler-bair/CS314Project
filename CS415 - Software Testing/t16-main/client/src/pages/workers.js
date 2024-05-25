import { useEffect, useState } from 'react'
import ClickList from '../components/ClickList'
import { getWorkers, getQualifications, createWorker } from '../services/dataService'
import LocationID from '../utils/location'
import { pageStyle } from '../utils/styles'
import Select from 'react-select'

const Worker = (worker, active) => {
    return (
        <div>
            <div>{worker.name}</div>
            {active === true ? WorkerBody(worker) : null}
            {active === worker ? <WorkerBody worker={worker} /> : null}
        </div>
    )
}

const WorkerBody = (worker) => {
    return (
        <div>
            <p>Name: {worker.name}</p>
            <p>Salary: {worker.salary}</p>
            <p>Workload {worker.workload}</p>
            <p>Projects: {worker.projects.join(", ")}</p>
            <p>Qualifications: {worker.qualifications.join(", ")}</p>
        </div>
    )
}

const Workers = () => {
    const [workers, setWorkers] = useState([])
    useEffect(() => { getWorkers().then(setWorkers) }, [])

    const [qualifications, setQualifications] = useState([])
    useEffect(() => { getQualifications().then(setQualifications) }, [])

    const [selectedQuals, setSelectedQuals] = useState(null);
    const [workerName, setWorkerName] = useState("");
    const [workerSalary, setWorkerSalary] = useState(null);

    const active = LocationID('workers', workers, 'name')
    const options = []
    qualifications.forEach(qual => {
        options.push({value: qual.description, label: qual.description})
    })

    return (
        <div style={pageStyle}>
            <h1>
                Hire a new worker!
            </h1>
            <div className='addWorker'>
                <input 
                    name='name' 
                    id='newWorkerName' 
                    placeholder={"Worker's Name"} 
                    value={workerName}
                    onChange={e => setWorkerName(e.target.value)}/>
                <Select
                    className='multi-select'
                    closeMenuOnSelect={false}
                    isMulti
                    placeholder="Qualifications"
                    value={selectedQuals}
                    defaultValue={selectedQuals}
                    onChange={setSelectedQuals}
                    options={options}
                />
                <input 
                    name='salary'
                    id='newWorkerSalary'
                    placeholder={"Worker's Salary"}
                    value={workerSalary}
                    onChange={e => setWorkerSalary(e.target.value)}
                    type="number"
                />
                <button
                    id='hireWorker'
                    onClick={() => {
                        let quals = selectedQuals.map(qual => qual.value)
                        let work = {
                            "name": workerName,
                            "salary": workerSalary,
                            "qualifications": quals
                        } 
                        createWorker(work)
                        .then(() => {
                            getWorkers()
                            .then(newWorkers => {
                                setWorkers(newWorkers);
                            })
                        })
                        setWorkerName('')
                        setWorkerSalary('')
                        setSelectedQuals('[]')
                    }}
                    disabled={
                        !(workerName !== "" && workerSalary && selectedQuals)
                    }>
                Hire a Worker</button>
            </div>

            <ClickList active={active} list={workers} item={Worker} path='/workers' id='name' />
        </div>
    )
}

export default Workers
