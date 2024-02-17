package assignments.polymorphisim;

public class EmployeeClass {
    public static void main(String[] args) {
        PartTimeEmployee part = new PartTimeEmployee(450, "Harsha", 40, 45.2);
        FullTimeEmployee full = new FullTimeEmployee(771, "Vishnu", 90);
        System.out.println("Contract employee: " + part.calculatePay());
        System.out.println("full time employee: " +full.calculatePay());
    }
}
