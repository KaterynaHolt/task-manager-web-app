import React, {Component, useState, useEffect} from 'react';
import AllTasksComponent from "./components/AllTasksComponent";

import './App.css';
import HeaderComponent from "./components/HeaderComponent";


function App() {
    return (
        <div style={{
            backgroundColor: "#C7D7FD",
            height: 630,
        }}>
            <HeaderComponent />
            <AllTasksComponent/>
        </div>
    )
}

export default App;
