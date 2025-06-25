package Week1_Algorithms_Data_Structure.Exercise4_EmployeeManagement;

public class EmployeeManager {
    Employee[] employees=new Employee[100]; 
    int count=0;
    public void addEmployee(Employee e) {
        if (count<employees.length) {
            employees[count++]=e;
        } else {
            System.out.println("Employee list full.");
        }
    }
    public void displayAll() {
        for (int i=0;i<count;i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee searchById(int id) {
        for (int i =0;i<count;i++) {
            if (employees[i].employeeId==id) return employees[i];
        }
        return null;
    }

    public void deleteById(int id) {
        for (int i=0;i<count;i++) {
            if (employees[i].employeeId==id) {
                for (int j=i;j<count-1;j++) {
                    employees[j]=employees[j+1]; 
                }
                employees[--count]=null;
                System.out.println("Deleted.");
                return;
            }
        }
        System.out.println("Not found.");
    }
}

