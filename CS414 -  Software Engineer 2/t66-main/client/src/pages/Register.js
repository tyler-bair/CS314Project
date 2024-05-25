import React, { useState } from 'react';
import { Link } from "react-router-dom";
import useRegister from "../hooks/useRegister";
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';
import { useNavigate } from 'react-router-dom';


export default function Register() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
	return (
		<div className="d-flex justify-content-center align-items-center vh-100">
      <div className="col-md-6">
        <h1 className="text-center">Team 66 Chess Application</h1>
        <h2 className="text-center">Registration Page</h2>
        <div className="form-group">
          <label>Username</label>
          <input type="text" className="form-control" onChange={event => {setUsername(event.target.value)}}/>
          </div>
          <div className="form-group">
            <label>Password</label>
            <input type="text" className="form-control" onChange={event => {setPassword(event.target.value)}}/>
          </div>
          <div className="form-group text-center">
            <RegisterCheck username={username} password={password}/>
          </div>
          <div className="text-center">
            <Link to='/'>Already registered? Login here.</Link>
          </div>
      </div>
    </div>
	);
}


function RegisterCheck(props) {
  const [modal, setModal] = useState(false);
  const [register, setRegister] = useState('0');
  const { addUser } = useRegister();
  const navigate = useNavigate();
  const toggle = () => setModal(!modal);
  const handleRegister = async () => {
    toggle();
    const userResponse = await addUser(props.username, props.password)
    if (userResponse == "true") {
      setRegister("Successfully registered. Redirecting you to the home page now.");
      setTimeout(() => {
        toggle(); 
        navigate('/home', {state:{username: props.username}}); }, 1500);
    } else if(userResponse == "Username and/or password cannot be null or empty" || userResponse == undefined) {
      setRegister("Username and/or password cannot be empty.")
    } else if (userResponse == "User already exists in the database") {
      setRegister("Username is taken, try again.")
    } else {
      setRegister("Password cannot be empty.");
    }
  }
  return (
    <RegisterModal modal={modal} toggle={toggle} register={register} handleRegister={handleRegister} /> 
  )    
}

function RegisterModal(props) {
  return (
    <div>
      <Button color='btn btn-primary' onClick={props.handleRegister}>
        Register Now
      </Button>
      <Modal isOpen={props.modal} toggle={props.toggle} register={props.register}>
        <ModalHeader toggle={props.toggle}></ModalHeader>
        <ModalBody>
          {props.register}
        </ModalBody>
        <ModalFooter>
          <Button color="secondary" onClick={props.toggle}>
            Close
          </Button>
        </ModalFooter>
      </Modal>
    </div>
  );

}

