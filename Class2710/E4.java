package org.example.Class2710;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Exercise 4
//
//Implement a feature that allows the user to update a student's GPA,
//courses taken, and hobbies in the program, serialize it, and display the
//updated information.
public class E4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Student student= null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"))){
            student = (Student) ois.readObject();
            System.out.println("Deserialization information about students: ");
            System.out.println(student);
        }  catch (IOException | ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
        if (student!=null){
            System.out.println("Enter new GPA");
            double newGpa= scanner.nextDouble();
            student.setGpa(newGpa);

            System.out.println("Enter new courses (or exit to finish adding) ");
            while (true){
                String course = scanner.next();
                if (course.equalsIgnoreCase("exit")){
                break;
                }
                String[] courses = course.split("[,\\s]+");
                student.setCourses(new ArrayList<>(Arrays.asList(courses)));
            }
            System.out.println("Enter new hobby (or exit to finish adding)");
            while (true){
                String hobby = scanner.next();
                if (hobby.equalsIgnoreCase("exit")){
                    break;
                }
                String[] hobbies = hobby.split("[,\\s]+");
                student.setHobbies(new ArrayList<>(Arrays.asList(hobbies)));
            }
            try (ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("students.ser"))){
                oos.writeObject(student);
                System.out.println("Students information is updated and serialized successfully");
                System.out.println(student);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
