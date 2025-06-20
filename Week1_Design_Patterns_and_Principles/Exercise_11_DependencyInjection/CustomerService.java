package Week1_Design_Patterns_and_Principles.Exercise_11_DependencyInjection;

public class CustomerService {
    private CustomerRepository repository;
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    public void getCustomerDetails(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println(customer);
    }
}
