package Week1_Algorithms_Data_Structure.Exercise4_EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager=new EmployeeManager();
        manager.addEmployee(new Employee(1,"Asha","Developer",45000));
        manager.addEmployee(new Employee(2,"Bala","Tester",30000));
        System.out.println("All Employees:");
        manager.displayAll();
        System.out.println("\nSearch ID 2:");
        System.out.println(manager.searchById(2));
        System.out.println("\nDeleting ID 1:");
        manager.deleteById(1);
        System.out.println("\nUpdated List:");
        manager.displayAll();
    }
}

