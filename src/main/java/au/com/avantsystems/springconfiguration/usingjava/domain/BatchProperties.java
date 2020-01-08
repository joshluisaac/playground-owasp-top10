package au.com.avantsystems.springconfiguration.usingjava.domain;

import java.time.LocalDateTime;

public class BatchProperties implements Properties {

  private LocalDateTime batchDate;

  public LocalDateTime getBatchDate() {
    return batchDate;
  }

  public void setBatchDate(LocalDateTime batchDate) {
    this.batchDate = batchDate;
  }

  public void runBatchProperties() {
    System.out.println("This was loaded");
  }
}
