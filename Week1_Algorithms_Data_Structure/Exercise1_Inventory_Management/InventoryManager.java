package Week1_Algorithms_Data_Structure.Exercise1_Inventory_Management;

import java.util.HashMap;

public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();
    public void addProduct(Product p) {
        inventory.put(p.productId,p);
    }
    public void updateProduct(int productId,int newQty,double newPrice) {
        Product p =inventory.get(productId);
        if (p!=null) {
            p.quantity =newQty;
            p.price =newPrice;
        } else {
            System.out.println("Product not found.");
        }
    }
    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }
    public void showInventory() {
        for (Product p:inventory.values()) {
            System.out.println(p);
        }
    }
}
