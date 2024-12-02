import java.math.BigDecimal;
public class Main {
  public static void main(String[] args) {
    BigDecimal tuition = BigDecimal.valueOf(10000);
    BigDecimal annualIncreaseRate = BigDecimal.valueOf(0.05);
    BigDecimal tuitionInTenYears = BigDecimal.ZERO;
    BigDecimal totalCostFourYears = BigDecimal.ZERO;
    for (int year = 1; year <= 10; year++) {
      tuition = tuition.add(tuition.multiply(annualIncreaseRate));
      if (year == 10) {
          tuitionInTenYears = tuition;
      }
    }
    for (int year = 1; year <= 4; year++) {
      totalCostFourYears = totalCostFourYears.add(tuition);
          tuition = tuition.add(tuition.multiply(annualIncreaseRate));
      }
   System.out.printf("Tuition in 10 years: $%.2f\n", tuitionInTenYears);
   System.out.printf("Total cost for 4 years after the 10th year: $%.2f\n", totalCostFourYears);
  }
 }