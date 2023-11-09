package org.example.BinaryTree;

import java.util.Objects;

public class Employee {
    private String name;
    private int id;
    private String department;
    private String jobTitle;
    private int managerId;
    private int yearOfHiring;
    private double salary;


    public Employee(String name, int id, String department, String jobTitle, int yearOfHiring, double salary,int managerId) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.jobTitle = jobTitle;
        this.yearOfHiring = yearOfHiring;
        this.salary=salary;
        this.managerId=managerId;

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

    @Override
    public String toString() {
        return  "jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", yearOfHiring=" + yearOfHiring +
                ", salary=" + salary ;
    }
}

