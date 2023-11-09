package org.example.BinaryTree;

public class TreeNode {
    private Employee employee;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Employee employee){
        this.employee = employee;
        this.left = null;
        this.right = null;
    }
    public Employee getEmployee(){
        return employee;
    }
    public void setEmployee(Employee employee){
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "employee=" + employee +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

