package org.example.Class3010;
import java.util.Arrays;
import java.util.List;


//Implement methods to filter and display employees by department, job title,
//or manager, taking advantage of Java Collections for filtering.
public class Exercise5 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Anna", 123, "HR", "Manager", 1),
                new Employee("Annika", 234, "HR", "Specialits", 0),
                new Employee("Boris", 345, "IT", "JavaDeveloper", 1),
                new Employee("Anton", 456, "Finance", "Accountant", 1));

        employees.forEach(employee -> System.out.println(employee.getName()));
        System.out.println("*********");


        filteredByDep(employees, "Finance"); // filter by department

        System.out.println("*********");

        filteredByTitl(employees,"JavaDeveloper"); // filter by job title

        System.out.println("*********");

        System.out.println(employeeCount(employees)); // counting employee
    }

    public static void filteredByDep(List<Employee> employees, String department) {
        List<Employee> filteredByDepartment = employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase(department)).toList();
        filteredByDepartment.forEach(employee -> System.out.println(employee.getName()));
    }

    public static void filteredByTitl(List<Employee> employees, String jobTitle) {
        List<Employee> filteredByTitle = employees.stream()
                .filter(employee -> employee.getJobTitle().equalsIgnoreCase(jobTitle)).toList();
        filteredByTitle.forEach(employee -> System.out.println(employee.getName()));
    }
    public static int employeeCount(List<Employee> employees) {
        return employees.size();

    }
}







