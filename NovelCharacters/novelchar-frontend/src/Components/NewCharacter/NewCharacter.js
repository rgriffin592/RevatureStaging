import React from 'react';
import "./NewCharacter.css";
import Grid from "@mui/material/Grid";
import Paper from "@mui/material/Paper";

function NewCharacter(props) {
    return (
        <div className="main__container">
            <Grid container className="newchar__container">
                <Grid item xs={2}></Grid>
                <Grid item xs={8}>
                    <Paper className="newcharpage__container">
                        <div className="newchar__header">
                            <p>Create a New Character</p>
                        </div>
                        <div className="dividor"></div>
                        <div className="newchar__rows">
                            <label>Name: </label>
                            <input 
                                type="text" 
                                className="form__control" 
                                placeholder="Enter Name" 
                            />
                        </div>
                        <div className="newchar__rows">
                            <label>Age: </label>
                            <input 
                                type="text" 
                                className="form__control" 
                                placeholder="Enter Age" 
                            />
                        </div>
                        <div className="newchar__rows">
                            <label>Select Powers: <br></br></label>
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="Magic"
                            /> Magic
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="SuperStrength"
                            /> Super Strength
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="Fly"
                            />Fly
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="Genius"
                            />Genius
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="ShapeShift"
                            />Shape Shift
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="Teleportation"
                            />Teleportation
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="ElementManipulation"
                            />Element Manipulation
                            <input 
                                type="checkbox" 
                                className="boxes" 
                                value="Invisibility"
                            />Invisibility
                        </div>
                        <div className="newchar__rows">
                            <label>Description: </label>
                            <input 
                                type="text" 
                                className="form__control" 
                                placeholder="Enter a brief description"
                                style={{ overflow : 'scroll', width : '70%', height : '135px', flexWrap : 'flex'}} 
                            />
                        </div>
                        <div className="newchar__rows">
                            <label>Add to Existing Novel? </label>
                            <br></br>
                            <select className="dropdown__content">
                                <option>Yes</option>
                                <option>Novel 2</option>
                            </select>
                            <select className="dropdown__content">
                                <option>No</option>
                            </select>
                        <div className="footer">
                            <button className="submit">Submit</button>
                        </div>
                        </div>
                    </Paper>
                </Grid>
                <Grid item xs={2}></Grid>
            </Grid>
        </div>
    );
}

export default NewCharacter;