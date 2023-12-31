import axios from "axios";

const TASK_API_BASE_URL = "http://localhost:8080/taskmanager/tasks";

class TaskService{
    getTasks(){
        return axios.get(TASK_API_BASE_URL);
    }
}

export default new TaskService()