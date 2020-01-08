package au.com.avantsystems.springconfiguration.usingjava.customer;

public class CustomerService {

  private EntityRepository<Customer> repository;

  public CustomerService(EntityRepository<Customer> repository) {
    this.repository = repository;
  }

  public void setRepository(EntityRepository<Customer> repository) {
    this.repository = repository;
  }
}
