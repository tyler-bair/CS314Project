import React, { useState } from 'react';
import { Link, useNavigate } from "react-router-dom";
import useLogin from '../hooks/useLogin';
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';


export default function Login() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  return (
      <div className="d-flex justify-content-center align-items-center vh-100">
        <div className="col-md-6">
          <h1 className="text-center">Team 66 Chess Application</h1>
          <h2 className="text-center">Login Page</h2>
          <InputField label="Username" type="text" setValue={setUsername} />
          <InputField label="Password" type="password" setValue={setPassword} />
          <LoginModal username={username} password={password} navigate={navigate} />
          <div className="text-center">
            <Link to='/register'>Not registered? Register here.</Link>
          </div>
        </div>
      </div>
  );
};

const InputField = ({ label, type, setValue }) => (
    <div className="form-group">
        <label>{label}</label>
        <input type={type} className="form-control" onChange={e => setValue(e.target.value)} />
    </div>
);

function LoginModal({ username, password }) {
  const [modal, setModal] = useState(false);
  const [loginMessage, setLoginMessage] = useState('');
  const { checkLogin } = useLogin();
  const navigate = useNavigate();
  const toggleModal = () => setModal(!modal);
  const handleLogin = async () => {
    toggleModal();
    const response = await checkLogin(username, password);
    handleResponse(response);
  };
  const handleResponse = (response) => {
    response.loginSuccess === "true" ? navigateToProfile() : setLoginMessage(response.responseMessage);
  };
  const navigateToProfile = () => {
    displaySuccessMessage("Login successful. Redirecting you to the home page now.");
    setTimeout(() => {
      toggleModal();
      navigate('/home', { state: { username } });
    }, 1500);};
  const displaySuccessMessage = (message) => {setLoginMessage(message);};
  return (
      <div className="form-group text-center">
        <LoginButton onClick={handleLogin} />
        <LoginStatusModal isOpen={modal} toggle={toggleModal} message={loginMessage} />
      </div>);}

function LoginButton({ onClick }) {
  return (
      <Button color='btn btn-primary' onClick={onClick}>
        Login Now
      </Button>
  );
}
function LoginStatusModal({ isOpen, toggle, message }) {

  return (
      <Modal isOpen={isOpen} toggle={toggle}>
        <ModalHeader toggle={toggle}></ModalHeader>
        <ModalBody>
          {message}
        </ModalBody>
        <ModalFooter>
          <Button color="secondary" onClick={toggle}>
            Close
          </Button>
        </ModalFooter>
      </Modal>
  );
}
