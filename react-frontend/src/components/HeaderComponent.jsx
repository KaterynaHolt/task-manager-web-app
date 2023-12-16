import React, {Component} from 'react';

class HeaderComponent extends Component {
    render() {
        return (
            <div>
                <header>
                    <nav className="navbar header-navbar">
                        <div><h1 className="title">Task List</h1>
                        </div>
                        <div className="mb-2">
                            <button className="btn add-button">Add Task</button>
                        </div>
                    </nav>
                </header>
            </div>
        );
    }
}

export default HeaderComponent;
