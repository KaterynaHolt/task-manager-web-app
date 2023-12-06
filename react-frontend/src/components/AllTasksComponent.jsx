import React, {Component} from 'react';
import TaskService from "../services/TaskService";
import "rsuite/dist/rsuite.min.css";
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
            this.setState({incompleted: res.data[0], completed: res.data[1]})
        });

    }



    render() {

        return (
            <div>
                <div class="container">
                    <br></br>
                    <br></br>
                    <h3 style={{marginTop: 30, display: "inline-block",}}>On Hold </h3>
                    <h6 style={{ marginLeft: 15, color: "red", display: "inline-block",}}>(You have {this.state.incompleted.length} tasks) </h6>
                    <div className="row">
                        <table className="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th className="text-center" style={{fontSize: 17, width: 250}}>Title</th>
                                <th className="text-center" style={{fontSize: 17, }}>Date</th>
                                <th className="text-center" style={{fontSize: 17, }}>Status</th>
                                <th className="text-center" style={{fontSize: 17, }}>Priority</th>
                                <th className="text-center" style={{fontSize: 17, }}>Tag</th>
                                <th style={{width: 175}}></th>
                            </tr>
                            </thead>
                            <tbody>
                            {

                                this.state.incompleted.map(
                                    task =>
                                        <tr key={task.id}>
                                            <td style={{verticalAlign: "middle", fontSize: 15, }}>
                                                <FontAwesomeIcon icon={faCircle} style={{marginRight: 10, color: "blue"}} /> {task.text }</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.date}</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.status}</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.priority}</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.tag}</td>
                                            <td className="text-center">
                                                <button className="btn btn-primary"><FontAwesomeIcon icon={faPenToSquare} /></button>
                                                <button className="btn btn-success" style={{marginLeft: "10px"}}><FontAwesomeIcon icon={faSquareCheck} /></button>
                                                <button className="btn btn-danger" style={{marginLeft: "10px"}}><FontAwesomeIcon icon={faTrash} /></button>
                                            </td>
                                        </tr>
                                )
                            }
                            </tbody>
                        </table>
                        <br></br>
                        <h3 style={{marginTop: 30}}>Completed </h3>
                        <table className="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th className="text-center" style={{fontSize: 17, width: 250}}>Title</th>
                                <th className="text-center" style={{fontSize: 17, }}>Date</th>
                                <th className="text-center" style={{fontSize: 17, }}>Status</th>
                                <th className="text-center" style={{fontSize: 17, }}>Priority</th>
                                <th className="text-center" style={{fontSize: 17, }}>Tag</th>
                                <th style={{width: 175}}></th>
                            </tr>
                            </thead>
                            <tbody>
                            {
                                this.state.completed.map(
                                    task =>
                                        <tr key={task.id}>
                                            <td style={{verticalAlign: "middle", fontSize: 15, }}>
                                                <FontAwesomeIcon icon={faCircle} style={{marginRight: 10, color: "blue"}} /> {task.text }</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.date}</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.status}</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.priority}</td>
                                            <td className="text-center" style={{verticalAlign: "middle", fontSize: 15, }}>{task.tag}</td>
                                            <td className="text-center">
                                                <button className="btn btn-secondary" style={{marginLeft: "10px"}}><FontAwesomeIcon icon={faCircleXmark} /></button>
                                                <button className="btn btn-danger" style={{marginLeft: "10px"}}><FontAwesomeIcon icon={faTrash} /></button>
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