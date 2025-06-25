package Week1_Algorithms_Data_Structure.Exercise5_TaskManagement;

public class TaskManager {
    class Node {
        Task task;
        Node next;
        Node(Task task) {
            this.task=task;
            this.next=null;
        }
    }
    Node head = null;
    public void addTask(Task task) {
        Node newNode=new Node(task);
        if (head==null) {
            head=newNode;
        } else {
            Node temp=head;
            while (temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }
    }
    public Task searchTask(int id) {
        Node temp=head;
        while (temp!=null) {
            if (temp.task.taskId==id)
                return temp.task;
            temp=temp.next;
        }
        return null;
    }
    public void deleteTask(int id) {
        if (head==null) return;
        if (head.task.taskId==id) {
            head=head.next;
            return;
        }
        Node temp=head;
        while (temp.next!=null&&temp.next.task.taskId!=id)
            temp=temp.next;

        if (temp.next!=null)
            temp.next=temp.next.next;
    }
    public void showTasks() {
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.task);
            temp=temp.next;
        }
    }
}
