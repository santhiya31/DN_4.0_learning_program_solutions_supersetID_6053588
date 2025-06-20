package Week1_Design_Patterns_and_Principles.Exercise_6_ProxyPattern;

public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromRemoteServer();
    }
    private void loadFromRemoteServer() {
        System.out.println("Loading image from remote server: " + fileName);
    }
    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}

