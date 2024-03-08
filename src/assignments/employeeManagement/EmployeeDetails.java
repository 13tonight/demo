package assignments.employeeManagement;

import java.util.Comparator;

public class EmployeeDetails implements Comparable<EmployeeDetails> {
    String name;
    int id;
    String department;
    double salary;

    public EmployeeDetails(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


//    @Override
//    public int compare(EmployeeDetails salary, EmployeeDetails o2) {
//        return Double.compare(salary.getSalary(), o2.getSalary());
//    }
//    @Override
//    public int compare(EmployeeDetails name1, EmployeeDetails name2) {
//        return name1.getName().compareTo(name2.getName());
//    }
//
    @Override
    public int compareTo(EmployeeDetails empDetail) {
        return this.name.compareTo(empDetail.name);
    }



}
