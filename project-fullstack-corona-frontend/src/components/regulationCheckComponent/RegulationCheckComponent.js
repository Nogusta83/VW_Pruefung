import React from "react";
import axios from 'axios';
import { withRouter } from "react-router-dom";
import ConditionalInput from './ConditionalInput';
import RegulationCheck from '../..//util/RegulationCheck';
import "./RegulationCheckComponent.css";
import OverviewStateComponent from '../overviewComponent/overViewStateComponent/OverviewStateComponent'


export class RegulationComponent extends React.Component {

    constructor(props) {
        super(props);
        
        this.state = {
            stateInput: 'Niedersachsen',
            personAmountInput:10,
            householdsInput: 1,
            inClosedRoomsInput: false,
            locationSizeInput: 1,
            wearMaskInput: false,
            regulation:'',
        }
    }
    
    handleClickCheckRegulation = () => {
        this.setState({regulation:''})
        axios.get('http://localhost:8080/regulation')
        .then((data) =>{
                    let regulation = data.data.filter((regulation) => regulation.state ==(this.state.stateInput))[0]
                    this.setState({regulation:regulation}) 
                    if (RegulationCheck.checkIfRegulationAreComplied(this.state)){
                        alert("Genehmigt")
                    } else {
                        alert("Leider erfüllen Sie nicht die Regularieren von "+ this.state.stateInput)
                    }
                    })
        .catch(error => {                    
        });     
    }

    updateStateInput = (event) => {
        this.setState({
            stateInput: event.target.value
        })
    }

    updatePersonAmountInput = (event) => {
        this.setState({
            personAmountInput: event.target.value
        })
    }

    updateHouseholdsInput = (event) => {
        this.setState({
            householdsInput: event.target.value
        })
    }


    updateInClosedRoomsInput = () => {
        this.setState(initialState => ({
            inClosedRoomsInput: !initialState.inClosedRoomsInput,
        }));
      }


    updateLocationSizeInput = (event) => {
        this.setState({
            locationSizeInput: event.target.value
        })
    }

    updateWearMaskInput = () => {
        this.setState(initialState => ({
            wearMaskInput: !initialState.wearMaskInput,
        }));
      }


    render() {

        return(
            <div>
                 <div className="regulation-check-component-wrapper">               
                            <label for="state">Bundesland</label>
                            <select name="state" id="state" onChange={this.updateStateInput}>
                                <option value="Baden-Württemberg">Baden-Württemberg</option>
                                <option value="Bayern">Bayern</option>
                                <option value="Berlin">Berlin</option>
                                <option value="Brandenburg">Brandenburg</option>
                                <option value="Bremen">Bremen</option>
                                <option value="Hamburg">Hamburg</option>
                                <option value="Hessen">Hessem</option>
                                <option value="Mecklenburg-Vorpommern">Mecklenburg-Vorpommern</option>
                                <option value="Niedersachsen">Niedersachsen</option>
                                <option value="Nordrhein-Westfalen">Nordrhein-Westfalen</option>
                                <option value="Rheinland-Pfalz">Rheinland-Pfalz</option>
                                <option value="Saarland">Saarland</option>
                                <option value="Sachsen">Sachsen</option>
                                <option value="Sachsen-Anhalt">Sachsen-Anhalt</option>
                                <option value="Schleswig-Holstein">Schleswig-Holstein</option>
                                <option value="Thüringen">Thüringen</option>
                            </select> 
                             <ConditionalInput                               
                                inputValue={this.state.personAmountInput}
                                labelText='Anzahl Personen'
                                type='number'
                                returnValue={this.updatePersonAmountInput}
                            />
                               <ConditionalInput                               
                                inputValue={this.state.householdsInput}
                                labelText='Anzahl an Haushalten'
                                type='number'
                                returnValue={this.updateHouseholdsInput}
                            />
                            <ConditionalInput                               
                                inputValue={this.state.locationSizeInput}
                                labelText='Veranstaltungsfläche [m2]'
                                type='number'
                                returnValue={this.updateLocationSizeInput}
                            />
                            <label>
                                    <input type="checkbox"
                                            checked={this.state.inClosedRoomsInput}
                                            onChange={this.updateInClosedRoomsInput}
                                    />
                                    in geschlossenen Räumen?
                            </label>
                            <label>
                                    <input type="checkbox"
                                            checked={this.state.wearMaskInput}
                                            onChange={this.updateWearMaskInput}
                                    />
                                    Tragen die Teilnehmer eine Maske?
                            </label>
                    <div className="checkEvent-wrapper">
                        <button 
                            className="button-checkEvent btn " 
                            onClick={this.handleClickCheckRegulation} 
                            > 
                        Check Veranstaltung
                        </button>         
                    </div>
                    {console.log(this.state.regulation)}
                    {this.state.regulation ?  <OverviewStateComponent  regData={this.state.regulation} /> : null}
                </div>
            </div>
        )
    }
}


  
export default withRouter(RegulationComponent);