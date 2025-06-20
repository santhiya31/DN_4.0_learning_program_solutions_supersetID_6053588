package Week1_Design_Patterns_and_Principles.Exercise_6_ProxyPattern;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); 
        }
        realImage.display();
    }
}

