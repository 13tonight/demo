package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class employeeMain {
    public static void main(String[] args) {
        List<employee> employeeClass = new ArrayList<>();
        employeeClass.add(new employee(1,"haswanth","gurram",35000));
        employeeClass.add(new employee(2,"vishnu","sreenu",40000));
        employeeClass.add(new employee(3,"ram","kumar",45000));
        employeeClass.add(new employee(4,"hari","viraj",55000));
        employeeClass.add(new employee(5,"dinesh","jayaram",60000));
        employeeClass.add(new employee(6,"vignesh","prasad",65000));

        List<String> firstNames = employeeClass.stream().filter(salary -> salary.getSalary() > 50000)
                .map(employee -> employee.getFirstName()).sorted(Comparator.reverseOrder()).toList();
        System.out.println(firstNames);


    }
}
