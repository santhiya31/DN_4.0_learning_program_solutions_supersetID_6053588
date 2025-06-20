package Week1_Design_Patterns_and_Principles.Exercise_11_DependencyInjection;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();  
        CustomerService service = new CustomerService(repo);     
        service.getCustomerDetails("101");
    }
}
