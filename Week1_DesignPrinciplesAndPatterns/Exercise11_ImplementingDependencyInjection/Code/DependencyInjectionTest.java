package Exercise11_ImplementingDependencyInjection.Code;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.displayCustomerDetails("100");
        service.displayCustomerDetails("1000"); 
    }
}

