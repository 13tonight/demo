package assignments.polymorphisim;

public class FullTimeEmployee extends Employee{

    int totalHours;

    public FullTimeEmployee(int employeeId, String employeeName, int totalHours) {
        super(employeeId, employeeName);
        this.totalHours = totalHours;
    }

    @Override
    public double calculatePay() {
        return totalHours * 20;
    }
}
