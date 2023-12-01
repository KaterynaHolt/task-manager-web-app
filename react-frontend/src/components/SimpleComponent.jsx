import React, {Component} from 'react';
import TaskService from "../services/TaskService";

class SimpleComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            message : ""
        }
    }

    componentDidMount() {
        TaskService.getTask().then((res) => {
            this.setState({message: res.data})
        });
    }

    render() {
        return (
            <div className="container">
                <h1 >{this.state.message}</h1>
            </div>
        );
    }
}

export default SimpleComponent;