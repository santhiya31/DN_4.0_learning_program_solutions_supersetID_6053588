package Week1_Design_Patterns_and_Principles.Exercise_3_BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                                .setCPU("Intel i9").setRAM("32GB")
                                .setStorage("1TB SSD").setGraphicsCard("NVIDIA RTX 4090")
                                .build();

        Computer officePC = new Computer.Builder()
                                .setCPU("Intel i5").setRAM("16GB").setStorage("512GB SSD")
                                .build(); 

        System.out.println("Gaming PC Configuration:");
        gamingPC.showConfig();

        System.out.println("\nOffice PC Configuration:");
        officePC.showConfig();
    }
}
