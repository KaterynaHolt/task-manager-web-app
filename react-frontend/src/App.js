import React, {Component, useState, useEffect} from 'react';
import logo from './logo.svg';
import './App.css';
import TaskService from "./services/TaskService";
import SimpleComponent from "./components/SimpleComponent";


function App() {
    return (
        <div className="container">
            <SimpleComponent/>
        </div>
    )
}

export default App;
