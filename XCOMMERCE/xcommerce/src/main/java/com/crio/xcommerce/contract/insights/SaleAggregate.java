
package com.crio.xcommerce.contract.insights;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleAggregate {

  public SaleAggregate(double totalSales2, List<SaleAggregateByMonth> aggregateByMonths2) {}
public SaleAggregate() {}
private Double totalSales;
  private List<SaleAggregateByMonth> aggregateByMonths;

}

