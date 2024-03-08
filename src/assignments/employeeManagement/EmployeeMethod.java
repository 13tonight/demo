package assignments.employeeManagement;

import java.util.*;

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
        }
    }

    public void updateEmployeeSalary(int id, double salary){
        employees.get(id).setSalary(salary);

    }

    public void sortByName(){
        List<EmployeeDetails> empDetail = new ArrayList<>(employees.values());
        Collections.sort(empDetail);
        for(EmployeeDetails emp : empDetail){
            System.out.println(emp);
        }
    }

    public void sortBySalary(){
        List<EmployeeDetails>  empSalary = new ArrayList<>(employees.values());
        Collections.sort(empSalary);
        System.out.println(empSalary);
    }
}
