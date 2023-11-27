import axios from "axios";

const TASK_API_BASE_URL = "http://localhost:8080/taskmanager/hello";

class TaskService{
    getTask(){
        return axios.get(TASK_API_BASE_URL);
    }
}

export default new TaskService()