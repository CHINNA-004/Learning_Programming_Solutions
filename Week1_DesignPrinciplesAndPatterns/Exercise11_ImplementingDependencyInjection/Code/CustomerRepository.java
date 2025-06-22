package Exercise11_ImplementingDependencyInjection.Code;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
