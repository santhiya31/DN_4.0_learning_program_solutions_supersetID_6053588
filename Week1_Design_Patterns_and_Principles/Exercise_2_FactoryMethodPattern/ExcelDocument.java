package Week1_Design_Patterns_and_Principles.Exercise_2_FactoryMethodPattern;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document");
    }
}