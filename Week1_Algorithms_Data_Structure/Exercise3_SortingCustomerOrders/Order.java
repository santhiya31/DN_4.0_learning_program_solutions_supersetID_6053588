package Week1_Algorithms_Data_Structure.Exercise3_SortingCustomerOrders;

public class Order {
    int orderId;
    String customerName;
    double totalPrice;
    public Order(int orderId,String customerName,double totalPrice) {
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }
    public String toString() {
        return "OrderID: "+orderId+", Customer: "+customerName+", Price:"+totalPrice;
    }
}

