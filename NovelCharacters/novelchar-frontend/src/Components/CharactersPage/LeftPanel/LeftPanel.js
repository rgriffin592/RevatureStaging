import React from 'react';
import "./LeftPanel.css";

function LeftPanel(props) {
    return (
        <div className="left__container">
            <div className="left__header">
                Filter
            </div>
            <div className="left__filter">
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="Magic" /> Magic
                </label>
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="SuperStrength" />Super Strength
                </label>
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="Fly" /> Fly
                </label>
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="Genius" /> Genius
                </label>
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="ShapeShift" /> Shape Shift
                </label>
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="Teleportation" /> Teleportation
                </label>
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="ElementManipulation" /> Element Manipulation
                </label>
                <label className="filtername">
                    <input style={{marginRight : "8px"}} type="checkbox" value="Invisibility" />Invisibility
                </label>
            </div>
        </div>
    );
}

export default LeftPanel;