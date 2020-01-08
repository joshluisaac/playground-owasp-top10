package au.com.avantsystems.springconfiguration.usingjava.customer;

import java.util.List;

public class HibernateCustomerRepository implements EntityRepository<Customer> {

  @Override
  public List<Customer> findAll() {
    return null;
  }
}
