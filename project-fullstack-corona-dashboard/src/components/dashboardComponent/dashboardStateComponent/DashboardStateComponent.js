import React from "react";
import axios from 'axios';
import "./DashboardStateComponent.css";

export class DashboardStateComponent extends React.Component {

    constructor(props) {
        super(props);
        
        let propData = this.props.regData;

        this.state = {
            stateName: propData.state
        }
    }

    handleImportClick = () =>{
        axios.post('http://localhost:8081/regulationImporter/import?stateName=' + this.state.stateName);
    }

    render() {
        return(
            <tr>
                <td>{this.state.stateName}</td>
                <td>datum</td>
                <td><button onClick={this.handleImportClick}>Import</button></td>
            </tr>
        )
    }
}

export default DashboardStateComponent;