package Week1_Algorithms_Data_Structure.Exercise3_SortingCustomerOrders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101,"Asha",5500),
            new Order(102,"Bala",1500),
            new Order(103,"Chetan",3500),
            new Order(104,"Deepa",2500)
        };

        System.out.println("Before Sorting:");
        for (Order o:orders) System.out.println(o);
        OrderSorter.quickSort(orders,0,orders.length-1);
        System.out.println("\nAfter Sorting by Price:");
        for (Order o :orders) System.out.println(o);
    }
}

