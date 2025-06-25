package Week1_Algorithms_Data_Structure.Exercise5_TaskManagement;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(new Task(1,"Complete Assignment","Pending"));
        manager.addTask(new Task(2,"Prepare Slides","In Progress"));
        manager.addTask(new Task(3,"Submit Report","Pending"));
        System.out.println("All Tasks:");
        manager.showTasks();
        System.out.println("\nSearching for Task 2:");
        System.out.println(manager.searchTask(2));
        System.out.println("\nDeleting Task 1...");
        manager.deleteTask(1);
        System.out.println("\nUpdated Tasks:");
        manager.showTasks();
    }
}
