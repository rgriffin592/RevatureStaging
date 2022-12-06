import React, { Component } from 'react';
import LeftPanel from './LeftPanel/LeftPanel';
import RightPanel from './RightPanel/RightPanel';

function CharactersPage(props){
        return (
            <div style={{ display : 'flex'}}>
                <div>
                    <LeftPanel />
                </div>
                <div>
                    <RightPanel />
                </div>
            </div>
        );
    }
 
export default CharactersPage;