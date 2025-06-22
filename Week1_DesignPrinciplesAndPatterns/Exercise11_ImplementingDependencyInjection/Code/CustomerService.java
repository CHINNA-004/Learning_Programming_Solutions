package Exercise11_ImplementingDependencyInjection.Code;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomerDetails(String id) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
        } else {
            System.out.println("Customer with ID " + id + " not found.");
        }
    }
}
