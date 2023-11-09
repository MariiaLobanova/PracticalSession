package org.example.Class3110;

import java.util.ArrayList;
import java.util.List;

//hire
//date and salary,
//Create a tree structure (e.g., binary tree) to represent the organization
//hierarchy based on manager-subordinate relationships, employing OOP
//principles for node design.
public class Tree {

    private Employee employee;
    private List<Employee> subordinates;

    public Tree(Employee employee) {
        this.employee = employee;
        this.subordinates = new ArrayList<>();
    }
    public Employee getEmployee() {
        return employee;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }
    public void addSubordinate(Tree subordinate){
        subordinates.add(subordinate.getEmployee());
    }

    public static void main(String[] args) {
        Employee CEO = new Employee("Anna", "IT", "CEO", 2022, 1000.00);
        Tree ceoNode= new Tree(CEO);

        Employee manager1 = new Employee("Anton", "IT", "Manager", 2017, 800.00);
        Employee manager2 = new Employee("Veronica", "HR", "Manager", 2014, 1200.00);
        Tree manager1Node = new Tree(manager1);
        Tree manager2Node = new Tree(manager2);

        ceoNode.addSubordinate(manager1Node);
        ceoNode.addSubordinate(manager2Node);

        Employee employee1 = new Employee("Boris", "IT", "Developer", 2019, 700.00);
        Employee employee2 = new Employee("Alina", "IT", "Developer", 2020, 600.00);
        Employee employee3 = new Employee("Annika", "IT", "QA", 2021, 600.00);
        Employee employee4 = new Employee("Denis", "HR", "specialist", 2023, 500.00);

        Tree employee1Node = new Tree(employee1);
        Tree employee2Node = new Tree(employee2);
        Tree employee3Node = new Tree(employee3);
        Tree employee4Node = new Tree(employee4);

        manager1Node.addSubordinate(employee1Node);
        manager1Node.addSubordinate(employee2Node);
        manager1Node.addSubordinate(employee3Node);
        manager2Node.addSubordinate(employee4Node);

        System.out.println(ceoNode.getEmployee());

        System.out.println("*********************");

        for (Employee subordinate: ceoNode.getSubordinates()){
            System.out.println(subordinate);
        }
        System.out.println("*********************");

        for (Employee subordinate: manager1Node.getSubordinates()){
            System.out.println(subordinate);
        }
        for (Employee subordinate: manager2Node.getSubordinates()){
            System.out.println(subordinate);
        }


    }
}
