package Week1_Design_Patterns_and_Principles.Exercise_2_FactoryMethodPattern;

public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
