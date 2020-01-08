package au.com.avantsystems.springconfiguration.usingjava.customer;

import java.util.List;

public interface EntityRepository<T> {

  List<T> findAll();
}
