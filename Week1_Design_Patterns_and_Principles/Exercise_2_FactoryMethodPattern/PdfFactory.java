package Week1_Design_Patterns_and_Principles.Exercise_2_FactoryMethodPattern;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}