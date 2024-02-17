package assignments.polymorphisim;

public class PartTimeEmployee extends Employee{

    double hours;
    double overTime;

    public PartTimeEmployee(int employeeId, String employeeName, double hours, double overTime) {
        super(employeeId, employeeName);
        this.hours = hours;
        this.overTime = overTime;
    }

    @Override
    public double calculatePay() {
        double regularHourPay = hours * 15;
        double overTimePay = overTime * 30;

        return regularHourPay + overTimePay;
    }
}
