package Week1_Algorithms_Data_Structure.Exercise2_Ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
    public static Product linearSearch(Product[] products, String name) {
        for (Product p:products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name) {
        Arrays.sort(products, Comparator.comparing(p->p.productName.toLowerCase()));
        int left=0, right=products.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            int cmp=products[mid].productName.compareToIgnoreCase(name);
            if (cmp==0) return products[mid];
            if (cmp<0) left=mid+1;
            else right=mid-1;
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(1,"Laptop","Electronics"),
            new Product(2,"Shirt","Clothing"),
            new Product(3,"Book","Education"),
            new Product(4,"Phone","Electronics"),
            new Product(5,"Shoes","Footwear")
        };
        Product found1 = linearSearch(products,"Phone");
        Product found2 = binarySearch(products,"Phone");
        System.out.println(found1!=null?"Linear Search Found: "+found1.productName:"Not Found");
        System.out.println(found2!=null?"Binary Search Found: "+found2.productName:"Not Found");
    }
}

