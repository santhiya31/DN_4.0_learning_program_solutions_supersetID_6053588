package Week1_Design_Patterns_and_Principles.Exercise_6_ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");
        img1.display();
        System.out.println();
        img1.display();
        System.out.println();
        img2.display();
    }
}

