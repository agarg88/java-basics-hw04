import java.text.DecimalFormat;

public class Employee implements Payable{
  String employeeId;
  String name;
  protected static double avgMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return avgMonthlySalary;
  }

  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("#0.00");

    return "Employee's name: " + this.name + ".Employee's average monthly salary: "
            + df.format(calculatePay());
  }

  @Override
  public int calculatePay() {
    return 0;
  }
}
