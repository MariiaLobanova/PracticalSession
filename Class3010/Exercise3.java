package org.example.Class3010;

import java.util.HashMap;

// Implement a HashMap to store employees with their IDs as keys.
//Encapsulate access to the map and provide methods for CRUD operations.
public class Exercise3 {
    public static void main(String[] args) {
        HashMap<Integer,String> employeeMap= new HashMap<>();
// create:
        employeeMap.put(123, "Anna");
        employeeMap.put(234, "Boris");
        employeeMap.put(345, "Anton");
        employeeMap.put(456, "Maria");

        System.out.println("Original map of employee: "+ employeeMap);
        System.out.println("*******");

        //read:
       int employeeId = 123;
        String employeeName = employeeMap.get(employeeId );
        if (employeeName!=null) {
            System.out.println("Emloyee with id:"+ employeeId + " : " + employeeName);
        }else{
            System.out.println("Emloyee with this id is not found");

        }
        //update
        int employeeUpdate = 345;
        employeeMap.put(employeeUpdate, "Anton Lobanov");
        System.out.println("*******");
        System.out.println("Updated map of employee: " + employeeMap);
        System.out.println("*******");


        // remove
        int employeeIdDelite = 234;
        String deliteEmployee = employeeMap.remove(employeeIdDelite);
        if(deliteEmployee!=null){
            System.out.println("Employee with id: "+ employeeIdDelite +"is delited succesfully");
        }else{
            System.out.println("Employee that you would like to delite is not exist");
        }
        System.out.println("*******");
        //display
        System.out.println("Map of employee: " + employeeMap);


    }
}
