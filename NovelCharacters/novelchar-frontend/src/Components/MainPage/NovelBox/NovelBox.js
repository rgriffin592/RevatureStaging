import React from 'react';
import "./NovelBox.css";

function NovelBox(props) {
    return (
        <div className="novel__main">
            <div className="novel__name">
                <em>Novel Name</em>
            </div>
            <div className="novel__author">
                Novel Author
            </div>
            <div className="novel__footer">
                See more
            </div>
        </div>
    );
}

export default NovelBox;