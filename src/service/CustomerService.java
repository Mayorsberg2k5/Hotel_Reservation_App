package service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import model.Customer;
public class CustomerService {
    private static CustomerService INSTANCE = new CustomerService();

    private static final Map<String, Customer> customers = new HashMap<>();

    private CustomerService() {
    }

    public static CustomerService getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new CustomerService();
        }

        return INSTANCE;
    }

    public void addCustomer(String email, String firstName, String lastName) {
            customers.put(email, new Customer (firstName, lastName, email));

    }

    public Customer getCustomer(final String customerEmail) {
        return customers.get(customerEmail);
    }

    public Collection<Customer> getAllCustomers() {
        return customers.values();
    }
}
