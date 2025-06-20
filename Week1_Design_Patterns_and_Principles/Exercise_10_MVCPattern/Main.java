package Week1_Design_Patterns_and_Principles.Exercise_10_MVCPattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Santhiya", "101", "O");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Santhiya K");
        controller.setStudentGrade("O");
        controller.updateView();
    }
}

