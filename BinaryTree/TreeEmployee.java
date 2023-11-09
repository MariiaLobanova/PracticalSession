package org.example.BinaryTree;

public class TreeEmployee {
    private TreeNode root;

    public void addEmployee(Employee employee) {
        if (root == null) {
            root = new TreeNode(employee);
        } else {
            insertEmployee(root, employee);
        }
    }

    public void addEmployee2(Employee employee) {
        TreeNode newNode = new TreeNode(employee);
        if (root == null) {
            root = newNode;
        } else {
            insertEmployee2(root, newNode);
        }
    }

    private void insertEmployee(TreeNode node, Employee employee) {
        if (employee.getId() < node.getEmployee().getId()) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(employee));
            } else {
                insertEmployee(node.getLeft(), employee);
            }
        } else if (employee.getId() > node.getEmployee().getId()) {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(employee));
            } else {
                insertEmployee(node.getRight(), employee);
            }
        }
    }

    private void insertEmployee2(TreeNode node, TreeNode newNode) {
        if (newNode.getEmployee().getManagerId() < node.getEmployee().getId()) {
            if (node.getLeft() == null) {
                node.setLeft(newNode);
            } else {
                insertEmployee2(node.getLeft(), newNode);
            }
        } else if (newNode.getEmployee().getManagerId() > node.getEmployee().getId()) {
            if (node.getRight() == null) {
                node.setRight(newNode);
            } else {
                insertEmployee2(node.getRight(), newNode); // Recur on the right subtree
            }
        }
        // Note: If managerId is equal to the node's ID, you can decide how to handle it (e.g., skip or handle it accordingly)
    }

    // Method to print the organization hierarchy (in-order traversal)
    // Exercise 2
    public void printHierarchy(TreeNode node) {
        if (node == null) {
            return;
        }
        printHierarchy(node.getLeft());
        System.out.println(node.getEmployee());
        printHierarchy(node.getRight());
    }

    public TreeNode getRoot() {
        return root;
    }

    public Employee findLowestCommonManager(int employeeId1, int employeeId2) {
        return findLowestCommonManager(root, employeeId1, employeeId2);
    }

    // Recursive method to find the lowest common manager of two employees
    // Exercise 4
    private Employee findLowestCommonManager(TreeNode node, int employeeId1, int employeeId2) {
        if (node == null) {
            return null;
        }
        // If either employeeId1 or employeeId2 is found, return the current node's employee
        if (node.getEmployee().getId() == employeeId1 || node.getEmployee().getId() == employeeId2) {
            return node.getEmployee();
        }

        Employee leftResult = findLowestCommonManager(node.getLeft(), employeeId1, employeeId2);
        Employee rightResult = findLowestCommonManager(node.getRight(), employeeId1, employeeId2);


            // If both employees are found in different subtrees, the current node's employee is the lowest common manager
        if (leftResult != null && rightResult != null) {
            return node.getEmployee();
        }

        // If only one employee is found, return that employee; otherwise, return null
        return leftResult != null ? leftResult : rightResult;
    }

    // Method to display the organization hierarchy with proper indentation
    // Exercise 5
    public void displayHierarchy(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        // Recur on the right subtree with increased depth
        displayHierarchy(node.getRight(), depth + 1);

        // Indent based on depth and display the current employee's information
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indentation.append("  ");
        }
        System.out.println(indentation + node.getEmployee().getName());

        // Recur on the left subtree with increased depth
        displayHierarchy(node.getLeft(), depth + 1);
    }



    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna", 1,"IT", "Developer", 2017, 1000,1);

        Employee employee2 = new Employee("Boris", 2, "HR","Specialist", 0,0,2);
        employee2.setSalary(500.00);
        employee2.setYearOfHiring(2023);

        System.out.println(employee1);
        System.out.println(employee2);

        TreeEmployee treeEmployee = new TreeEmployee();
        treeEmployee.addEmployee(new Employee("Anton", 101,"--","CEO", 2016,2000,1));
        treeEmployee.addEmployee(new Employee("Polina", 102,"IT","Manager", 2019,1000,2));
        treeEmployee.addEmployee(new Employee("Annika", 103,"IT","QA", 2017,800,3));
        treeEmployee.addEmployee(new Employee("Leo", 104,"IT","QA", 2019,800,4));
        treeEmployee.addEmployee(new Employee("Paul", 105,"IT","Developer", 2015,900,5));

        System.out.println("New Tree Hierarhy: ");
        treeEmployee.printHierarchy(treeEmployee.getRoot());
    }

}




