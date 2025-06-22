package Exercise11_ImplementingDependencyInjection.Code;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerData = new HashMap<>();

    public CustomerRepositoryImpl() {
        customerData.put("100", new Customer("100", "John "));
        customerData.put("101", new Customer("101", "Smith"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerData.get(id);
    }
}

