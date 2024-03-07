package assignments.employeeManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMethod {

    Map<Integer, EmployeeDetails> employees = new HashMap<>();

    public void addEmployeeDetails(EmployeeDetails details){
        employees.put(details.getId(), details);
        //employees.put(details.getId(),  );
    }

    public void removeEmployeeById(int id) throws EmployeeNotFoundException {
        if(!employees.containsKey(id)){
            throw new EmployeeNotFoundException("Employee with "+ id + " not found");
        }
        employees.remove(id);
    }

    public void allEmployeeDetails(){
        Set<Map.Entry<Integer, EmployeeDetails>> empDetails = employees.entrySet();
        for (Map.Entry<Integer, EmployeeDetails> emp : empDetails){
            System.out.println("Id: " + emp.getValue().id + " Name: "+ emp.getValue().name + " Department: " + emp.getValue().department + " Salary: " + emp.getValue().salary);
            //System.out.println(emp.getValue().name);
            //System.out.println(emp.getValue().department);
            //System.out.println(emp.getValue().salary);
        }
    }

    public void updateEmployeeSalary(int id, double salary){
        employees.get(id).setSalary(salary);

    }

}
