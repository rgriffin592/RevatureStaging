import React from 'react';
import "./RightPanel.css";

function CharactersBox(props) {
    return (
        <div className="char__container">
            <div className="char__name">
                Character Name
            </div>
            <div className="char__age">
                Character Age
            </div>
            <div className="char__powers">
                Character Powers
            </div>
            <div className="char__description">
                Description
            </div>
            <div className="char__footer">
                <em>View Character</em>
            </div>
        </div>
    );
}

export default CharactersBox;