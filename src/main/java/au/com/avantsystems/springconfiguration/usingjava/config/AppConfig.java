package au.com.avantsystems.springconfiguration.usingjava.config;

import au.com.avantsystems.springconfiguration.usingjava.customer.CustomerService;
import au.com.avantsystems.springconfiguration.usingjava.customer.EntityRepository;
import au.com.avantsystems.springconfiguration.usingjava.customer.HibernateCustomerRepository;
import au.com.avantsystems.springconfiguration.usingjava.domain.BatchProperties;
import au.com.avantsystems.springconfiguration.usingjava.domain.Properties;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

  @Bean(name = "hibernateCustomerRepository")
  public EntityRepository getHibernateCustomerRepository() {
    return new HibernateCustomerRepository();
  }

  @Bean(name = "customerService")
  @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
  public CustomerService getCustomerService() {
    return new CustomerService(getHibernateCustomerRepository());
  }

  @Bean
  public Properties getBatchProperties() {
    return new BatchProperties();
  }
}
