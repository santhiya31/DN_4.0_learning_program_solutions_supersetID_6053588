package Week1_Design_Patterns_and_Principles.Exercise_10_MVCPattern;

public class StudentView {
    public void displayStudentDetails(String name, String id, String grade) {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}

