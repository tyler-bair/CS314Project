import { useEffect, useState } from 'react'
import ClickList from '../components/ClickList'
import { getQualifications, createQualification } from '../services/dataService'
import LocationID from '../utils/location'
import { pageStyle } from '../utils/styles'

const Qualification = (qualification, active) => {
    return (
        <div>
            <div>{qualification.description}</div>
            {active === true ? QualificationBody(qualification) : null}
        </div>
    )
}

const QualificationBody = (qualification) => {
    return (
        <div>
            <p>Workers: <ClickList list={qualification.workers} path="/workers" /></p>
        </div>
    )
}

const Qualifications = () => {
    const [qualifications, setQualifications] = useState([])
    const [inputDescription, setInputDescription] = useState("")
    
    useEffect(() => {
        getQualifications().then(setQualifications)
    }, [])

    const active = LocationID('qualifications', qualifications, 'description')

    return (
        <div style={pageStyle}>
            <h1>Create or view qualifications</h1>
            <div className='addWorker'>
                <input 
                    style = {{height: '38px'}}
                    name='description' 
                    id='newQualificationDescription' 
                    placeholder="Qualification Description" 
                    value={inputDescription}
                    onChange={(e) => setInputDescription(e.target.value)}
                />
                <button
                    id='createQualification'
                    onClick={() => {
                        createQualification(inputDescription)
                            .then(() => {
                                getQualifications()
                                    .then(newQualifications => {
                                        setQualifications(newQualifications);
                                    })
                            })
                        setInputDescription('')
                    }}
                    disabled={!inputDescription}>
                Create Qualification</button>
            </div>

            <ClickList active={active} list={qualifications} item={Qualification} path='/qualifications' id='description' />
        </div>
    )
}

export default Qualifications
