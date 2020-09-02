import React from "react";
import axios from 'axios';
import DashboardStateComponent from "./dashboardStateComponent/DashboardStateComponent";
import "./DashboardComponent.css"

export class DashboardComponent extends React.Component {

    constructor(props) {
        super(props);
        
        this.state = {
            regulations:[]
        }
    }

    componentDidMount(){
        axios.get('http://localhost:8080/regulation')
        .then((data) =>{
                    this.setState({regulations:data.data}) 
                    console.log(this.state.regulations)
                    })
        .catch(error => {                    
        });     
    }

    renderStateTableRowComponent = (regulations) => {   
        return(
            <tbody>
                {regulations.map((regulation) => {
                    return <DashboardStateComponent regData={regulation}/>
                })}
            </tbody>
        ) 
    }

    render() {
        return(
            <div className="tableWrapper">
                <table>
                    <thead>
                    <tr>
                        <th>Bundesland</th>
                        <th>Datenstand</th>
                        <th>importieren</th>
                    </tr>
                    </thead>
                    {this.renderStateTableRowComponent(this.state.regulations)}
                </table>
            </div>
        )
    }
}



export default DashboardComponent;