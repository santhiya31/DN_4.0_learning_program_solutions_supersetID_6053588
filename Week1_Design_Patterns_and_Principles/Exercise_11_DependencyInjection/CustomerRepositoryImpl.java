package Week1_Design_Patterns_and_Principles.Exercise_11_DependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        return "Customer ID: " + id + ", Name: Santhiya";
    }
}

