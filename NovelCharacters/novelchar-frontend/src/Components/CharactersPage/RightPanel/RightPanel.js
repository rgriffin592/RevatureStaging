import React from 'react';
import "./RightPanel.css";
import CharactersBox from './CharactersBox';

function RightPanel(props) {
    return (
        <div className="right__main">
            <CharactersBox />
            <CharactersBox />
            <CharactersBox />
            <CharactersBox />
            <CharactersBox />
            <CharactersBox />
        </div>
    );
}

export default RightPanel;