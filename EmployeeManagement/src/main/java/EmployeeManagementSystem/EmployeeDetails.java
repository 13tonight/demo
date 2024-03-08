package EmployeeManagementSystem;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(EmployeeDetails empDetail) {
        return this.name.compareTo(empDetail.name);
    }



}
