import React, { Component } from 'react';
import "./MainPage.css";
import NovelBox from './NovelBox/NovelBox';

class MainPage extends Component {
    constructor(props) {
        super(props);
        this.state = { }
    }
    render() { 
        return (
            <div className="mainpage">
                <NovelBox />
                <NovelBox />
                <NovelBox />
                <NovelBox />
                <NovelBox />
                <NovelBox />
            </div>
        );
    }
}
 
export default MainPage;