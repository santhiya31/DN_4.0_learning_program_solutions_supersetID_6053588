package Week1_Algorithms_Data_Structure.Exercise5_TaskManagement;

public class Task {
    int taskId;
    String taskName;
    String status;
    public Task(int taskId,String taskName,String status) {
        this.taskId=taskId;
        this.taskName=taskName;
        this.status=status;
    }
    public String toString() {
        return "TaskID: " +taskId+", Task: " +taskName+ ", Status: "+status;
    }
}
