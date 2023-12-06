import React, {Component} from 'react';

class HeaderComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {

        }
    }


    render() {
        return (
            <div>
                <header>
                    <nav className="navbar" style={{backgroundColor: "#A4BDFA"}}>
                        <div><h1 style={{color: "#EAEFF8", marginLeft: 20}}>Task List</h1>

                        </div>
                        <div className="mb-2">
                            <button className="btn"
                                    style={{float: "right",
                                        marginRight: 40,
                                        backgroundColor: "#C7D7FD",
                                        color: "black" }}>Add Task</button>
                        </div>
                    </nav>
                </header>
            </div>
        );
    }
}

export default HeaderComponent;
