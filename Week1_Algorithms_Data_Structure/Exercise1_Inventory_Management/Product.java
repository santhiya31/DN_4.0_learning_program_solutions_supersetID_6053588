package Week1_Algorithms_Data_Structure.Exercise1_Inventory_Management;

public class Product {
    int productId;
    String productName;
    int quantity;
    double price;
    public Product(int productId,String productName,int quantity,double price) {
        this.productId =productId;
        this.productName =productName;
        this.quantity =quantity;
        this.price =price;
    }
    public String toString() {
        return "ID: "+productId+", Name: " +productName+", Qty: "+quantity+ ", Price: ₹"+price;
    }
}
