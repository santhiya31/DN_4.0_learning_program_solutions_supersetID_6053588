package Week1_Algorithms_Data_Structure.Exercise1_Inventory_Management;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Product p1=new Product(101,"Laptop",10,50000);
        Product p2=new Product(102,"Mouse", 50,500);
        Product p3=new Product(103,"Keyboard", 20,1500);
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        System.out.println("Initial Inventory:");
        manager.showInventory();
        manager.updateProduct(102,60,550);
        manager.deleteProduct(101);
        System.out.println("\nAfter Update and Delete:");
        manager.showInventory();
    }
}

