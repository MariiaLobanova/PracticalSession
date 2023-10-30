package org.example.Class2710;
// Exercise 9
//
//Create a function to display a list of all serialized student objects with
//their names and GPAs.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class E9 {

    public static void main(String[] args) {
        prefillStudents("students.ser"); // seriliazation
        List<Student> deserializedStudents = deserializeStudents("students.ser");// deseriliazation

        if (deserializedStudents != null) {
            displaySummaryReport(deserializedStudents);
        }

    }

    public static void prefillStudents(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            Student student1 = new Student("Anna", 123, 22, List.of("knitting", "reading"), 95.55, List.of("Math", "English", "History"));
            Student student2 = new Student("Elizabeth", 128, 16, List.of("running", "music"), 89.55, List.of("Biology", "Economics"));

            oos.writeObject(student1);
            oos.writeObject(student2);
            System.out.println("Serialization is complete");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Student> deserializeStudents(String fileName) {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    students.add(student);
                } catch (EOFException e) {
                    break; // end of file reached
                }
            }
            System.out.println("Deserialization is complete");
            System.out.println(students.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
    public static void displaySummaryReport(List<Student>students){
        double totalGPA = 0;
        int studentCount = students.size();

        System.out.println("Summary report");
        for(Student student: students){
            totalGPA += student.getGpa();

            System.out.println("Student: "+ student.getName());
            System.out.println("GPA: " + student.getGpa());
        }
        double averageGpa = totalGPA/ studentCount;
        System.out.println("Average GPA of all students: "+ averageGpa);
    }
}




