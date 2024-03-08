package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeClass {
    public static void main(String[] args) throws EmployeeNotFoundException {
        EmployeeMethod employeeMethod = new EmployeeMethod();
        Scanner sc=  new Scanner(System.in);
        employeeMethod.addEmployeeDetails(new EmployeeDetails("haswanth", 101, "java", 89800.15 ));
        employeeMethod.addEmployeeDetails(new EmployeeDetails("rahul", 102, "in-orgonic", 79800.05 ));
        employeeMethod.addEmployeeDetails(new EmployeeDetails("Dinesh", 104, "orgonic", 85800.35 ));
        employeeMethod.addEmployeeDetails(new EmployeeDetails("vamsi", 103, "instrumentaion", 69800.65 ));


        System.out.println("Welcome to Employee Management System!");
        System.out.println("=======================================================================================");
        System.out.println("1.Add new employee");
        System.out.println("2.Remove employee");
        System.out.println("3.Retrieve employee details");
        System.out.println("4.Update employee salary");
        System.out.println("5.Display all employees sorted by name");
        System.out.println("6.Exit");
        int choose;
        try{
            do{
                choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter the employee ID: ");
                        int id = sc.nextInt();
                        System.out.println("Employee name: ");
                        String name = sc.next();
                        System.out.println("Department: ");
                        String department = sc.next();
                        System.out.println("Salary: ");
                        double salary = sc.nextDouble();
                        employeeMethod.addEmployeeDetails(new EmployeeDetails(name, id, department, salary));
                        //count = 0;
                        break;
                    case 2:
                        System.out.println("Enter the employee id which you want to remove: ");
                        int removeId = sc.nextInt();
                        employeeMethod.removeEmployeeById(removeId);
                        break;
                    case 3:
                        System.out.println("================All employee details====================");
                        employeeMethod.allEmployeeDetails();
                        break;
                    case 4:
                        System.out.println("Enter the ID: ");
                        int empId = sc.nextInt();
                        System.out.println("Enter the salary Amount: ");
                        double empSalary = sc.nextDouble();
                        employeeMethod.updateEmployeeSalary(empId, empSalary);
                        break;
                    case 5:
                        System.out.println("+++++++++++++++++++++++++++++++++Sorted by name++++++++++++++++++++++++++++++");
                        employeeMethod.sortByName();
                        break;
                    case 6:
                        System.out.println("============================Thanks for using================================");
                        break;

                }
            }while(choose < 6);
            if(choose > 6){
                System.out.println("you entered "+ choose + " is not a valid option please chose from 1 to 6");
            }
        }catch (Exception  e){
            System.out.println("Some thing went wrong you did not choose a correct option");
        };

    }
}
