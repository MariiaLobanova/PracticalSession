package org.example.Class3110;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Date;

public class Employee {
        private String name;
        private int id;
        private String department;
        private String jobTitle;
        private int managerId;
        private int yearOfHiring;
        private double salary;


        public Employee(String name, int id, String department, String jobTitle, int managerId) {
            this.name = name;
            this.id = id;
            this.department = department;
            this.jobTitle = jobTitle;
            this.managerId = managerId;
        }
    public Employee(String name,String department, String jobTitle, int yearOfHiring, double salary)  {
        this.name = name;
        this.department = department;
        this.jobTitle = jobTitle;
        this.yearOfHiring = yearOfHiring;
        this.salary = salary;
    }
    public int getYearOfHiring() {
        return yearOfHiring;
    }
    public void setYearOfHiring(int yearOfHiring) {
        this.yearOfHiring = yearOfHiring;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
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

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public int getManagerId() {
            return managerId;
        }

        public void setManagerId(int managerId) {
            this.managerId = managerId;
        }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public String toString() {
        return "Employee" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", yearOfHiring=" + yearOfHiring +
                ", salary=" + salary;
    }
}
class TreeNode {
    private Employee employee;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Employee employee) {
        this.employee = employee;
        this.left = null;
        this.right = null;
    }
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

