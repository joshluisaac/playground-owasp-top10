package au.com.avantsystems.springconfiguration.usingjava;

import au.com.avantsystems.springconfiguration.usingjava.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @ComponentScan
public class App {

  public static void main(String[] args) throws InterruptedException {

    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    // Properties batchProperties = context.getBean(BatchProperties.class);

    // System.out.println(context.getBean("customerService", CustomerService.class).toString());
    // System.out.println(context.getBean("customerService", CustomerService.class).toString());
    // System.out.println(context.getBean("customerService", CustomerService.class).toString());

    // Thread.sleep(1200000);

    // batchProperties.runBatchProperties();
  }
}
