import React, {Component, useState, useEffect} from 'react';
import {BrowserRouter as Router} from 'react-router-dom'
import {Routes, Route} from "react-router";
import AllTasksComponent from "./components/AllTasksComponent";
import HeaderComponent from "./components/HeaderComponent";

import './App.css';
import './AllTasksPage.css';
import './Header.css';

function App() {
    return (
        <div className="background">
            <Router>
            <HeaderComponent />
                <Routes>
                    <Route exact path="/" element={<AllTasksComponent/>}></Route>
                    <Route path="/taskmanager" element={<AllTasksComponent/>}></Route>
                </Routes>
            </Router>
        </div>
    )
}

export default App;
