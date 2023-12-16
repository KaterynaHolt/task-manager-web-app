import React, {Component, useState, useEffect} from 'react';
import AllTasksComponent from "./components/AllTasksComponent";
import HeaderComponent from "./components/HeaderComponent";

import './App.css';
import './AllTasksPage.css';
import './Header.css';

function App() {
    return (
        <div className="background">
            <HeaderComponent />
            <AllTasksComponent/>
        </div>
    )
}

export default App;
