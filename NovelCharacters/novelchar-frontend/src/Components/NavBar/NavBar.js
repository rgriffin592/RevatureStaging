import React, { Component } from 'react';
import "./NavBar.css";
import Grid from "@mui/material/Grid";
import SearchIcon from "@mui/icons-material/Search";
import { Link } from "react-router-dom";
import MenuItem from "@mui/material/MenuItem";

class NavBar extends Component {
    constructor(props) {
        super(props);
        this.state = { }
    }
    render() { 

        return (
            <div>
                <Grid container className="navbar">
                    <Grid item xs={3}>
                        <div className="navbar__left">
                            <img className="navbar__logo" 
                            src="https://www.nicepng.com/png/detail/793-7936442_book-logo-png-books-logo-black-png.png" 
                            alt="Book Logo Png - Books Logo Black Png@nicepng.com"
                            />
                            <div className="navbar__search">
                                <SearchIcon />
                                <input type="text" placeholder="Search" />
                            </div>
                        </div>
                    </Grid>
                    <Grid item xs={3}></Grid>
                    <Grid item xs={6}>
                        <div className="navbar__right">
                            <MenuItem>VIEW NOVELS</MenuItem>
                            <MenuItem>CREATE NOVEL</MenuItem>
                            <MenuItem>VIEW CHARACTERS</MenuItem>
                            <MenuItem>CREATE CHARACTER</MenuItem>
                        </div>
                    </Grid>
                </Grid>
            </div>
        );
    }
}
 
export default NavBar;