package org.example.Class3010;

import java.util.*;
import java.util.stream.Collectors;

//Implement methods to update employee information while maintaining data
//integrity.
public class Exercise6 {
    public static void main(String[] args) {

        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Anna", 123, "HR", "Manager", 1));
        employees.add(new Employee("Annika", 234, "HR", "Specialits", 0));
        employees.add(new Employee("Boris", 345, "IT", "JavaDeveloper", 1));
        employees.add(new Employee("Anton", 456, "Finance", "Accountant", 1));

        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment, Collectors.counting()));

        List<Employee> employeesInHR = employees.stream()
                .filter(employee -> "HR".equalsIgnoreCase(employee.getDepartment())).toList();

        System.out.println("Employee report : ");

        for (Map.Entry<String,Long>entry: departmentCount.entrySet()){
            String department = entry.getKey();
            Long count = entry.getValue();

            System.out.println("Department: " + department);
            System.out.println("Total Employees: " + count);
            if ("HR".equals(department)) {
                System.out.println("Employees in HR department:");
                for (Employee employee : employeesInHR) {
                    System.out.println("Name: " + employee.getName() + ", Job Title: " + employee.getJobTitle());
                }
            }
            System.out.println("-------");
        }
    }
}
