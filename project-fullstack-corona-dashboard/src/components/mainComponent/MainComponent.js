import React from "react";
import ConditionalInput from '../conditionalInput/ConditionalInput';
import DashboardComponent from '../dashboardComponent/DashboardComponent';
import "./MainComponent.css"

export class MainComponent extends React.Component {

    constructor(props) {
        super(props);
        
        this.state = {
            username:'',
            password:'',
            isLoginSuccess: false
        }
    }

    handleLogoutClick = () => {
        this.setState({
            isLoginSuccess: false,
            username:'',
            password:''
        })
    }

    handleLoginClick = () => {
        if(this.state.username === "admin" && this.state.password === "adminpasswort"){
            this.setState({isLoginSuccess: true})
        }    
    }

    updateUsernameInput = (event) => {
        this.setState({
            username: event.target.value
        })
    }

    updatePasswordInput = (event) => {
        this.setState({
            password: event.target.value
        })
    }

    render() {
        return(
            <div>
                {!this.state.isLoginSuccess? 
                <div className="loginWrapper">
                    <label className="loginLabel">LOGIN</label>
                    <ConditionalInput                               
                        inputValue={this.state.username}
                        labelText='Nutzername'
                        type='text'
                        returnValue={this.updateUsernameInput}
                    />
                    <ConditionalInput                               
                        inputValue={this.state.password}
                        labelText='Passwort'
                        type='password'
                        returnValue={this.updatePasswordInput}
                    />
                    <div className="loginButtonWrapper">
                        <button onClick={this.handleLoginClick} className="loginButton"> 
                            login
                        </button> 
                    </div>
                </div> 
                :
                <div className="logoutButtonWrapper">
                    <button onClick={this.handleLogoutClick} className="logoutButton">
                        Logout
                    </button>
                </div>
                }
                {this.state.isLoginSuccess? <DashboardComponent /> : null} 
            </div>
        )
    }
}

export default MainComponent;