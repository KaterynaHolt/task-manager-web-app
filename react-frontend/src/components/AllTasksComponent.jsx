import React, {Component} from 'react';
import TaskService from "../services/TaskService";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faCircle, faPenToSquare, faSquareCheck, faCircleXmark} from '@fortawesome/free-regular-svg-icons'
import { faTrash } from '@fortawesome/free-solid-svg-icons'

class AllTasksComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            incompleted: [],
            completed: [],
        }
    }

    componentDidMount() {
        TaskService.getTasks().then((res) => {
            let data = res.data;
            this.setState({incompleted: data.incompleted, completed: data.completed})
        });
    }

    render() {
        return (
            <div>
                <div class="container">
                    <br></br>
                    <br></br>
                    <h3 className="table-name">On Hold </h3>
                    <h6 className="incompleted-info">(You have {this.state.incompleted.length} tasks) </h6>
                    <div className="row">
                        <table className="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th className="table-header-title">Title</th>
                                <th className="table-header-date">Date</th>
                                <th className="table-header-date">Status</th>
                                <th className="table-header-date">Priority</th>
                                <th className="table-header-icon">Tag</th>
                                <th className="table-header-icon"></th>
                            </tr>
                            </thead>
                            <tbody>
                            {
                                this.state.incompleted.map(
                                    task =>
                                        <tr key={task.id}>
                                            <td className="table-body-title">
                                                <FontAwesomeIcon icon={faCircle} className="table-body-title-icon"/> {task.text }</td>
                                            <td className="table-body-date">{task.date}</td>
                                            <td className="table-body-date">{task.status}</td>
                                            <td className="table-body-date">{task.priority}</td>
                                            <td className="table-body-date">{task.tag}</td>
                                            <td className="text-center">
                                                <button className="btn btn-primary"><FontAwesomeIcon icon={faPenToSquare} /></button>
                                                <button className="btn btn-success button-table"><FontAwesomeIcon icon={faSquareCheck} /></button>
                                                <button className="btn btn-danger button-table"><FontAwesomeIcon icon={faTrash} /></button>
                                            </td>
                                        </tr>
                                )
                            }
                            </tbody>
                        </table>
                        <br></br>
                        <br></br>
                        <h3 className="table-name completed">Completed </h3>
                        <table className="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th className="table-header-title">Title</th>
                                <th className="table-header-date">Date</th>
                                <th className="table-header-date">Status</th>
                                <th className="table-header-date">Priority</th>
                                <th className="table-header-icon">Tag</th>
                                <th className="table-header-icon"></th>
                            </tr>
                            </thead>
                            <tbody>
                            {
                                this.state.completed.map(
                                    task =>
                                        <tr key={task.id}>
                                            <td className="table-body-title">
                                                <FontAwesomeIcon icon={faCircle} className="table-body-title-icon"/> {task.text }</td>
                                            <td className="table-body-date">{task.date}</td>
                                            <td className="table-body-date">{task.status}</td>
                                            <td className="table-body-date">{task.priority}</td>
                                            <td className="table-body-date">{task.tag}</td>
                                            <td className="text-center">
                                                <button className="btn btn-secondary button-table"><FontAwesomeIcon icon={faCircleXmark} /></button>
                                                <button className="btn btn-danger button-table"><FontAwesomeIcon icon={faTrash} /></button>
                                            </td>
                                        </tr>
                                )
                            }
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        );
    }
}

export default AllTasksComponent;