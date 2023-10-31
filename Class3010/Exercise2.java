package org.example.Class3010;

import java.util.*;
// Implement a HashSet to store unique employees. Utilize proper data
//structures and ensure efficient searching.

public class Exercise2 {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();

        Employee employee1= new Employee("Anna", 123, "HR", "Manager", 1);
        Employee employee2 = new Employee("Annika", 234, "HR", "Specialits", 0);
        Employee employee3 = new Employee("Boris", 345, "IT", "JavaDeveloper", 1);
        Employee employee4 = new Employee("Anton", 456, "Finance", "Accountant", 1);

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);

        System.out.println(employeeSet);
        for (Employee employee: employeeSet){
            System.out.println(employee);
        }

        Scanner scanner = new Scanner(System.in); // for searching employee by id
        System.out.println("Type number id for searching: ");
        int searchId= scanner.nextInt();
        searchById(employeeSet, searchId);
    }

    public static void searchById (Set<Employee> employeeSet, int id){  // possibility searching by id
        for (Employee employee: employeeSet) {
            if(employee.getId()==id){
                System.out.println("emploee was found " + employee);
                return;
            }
        }
        System.out.println("Employee id: "+id+ "not found");
    }
}
