package org.example.Class2610;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Create multiple instances of the Student class, serialize them to the
//same file, and handle any potential conflicts.

//Add error handling for serialization, especially for class/version
//        mismatches.
public class E2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Veronika", 13, 345678, 9.5, "Neuertor-Allee", // create instances
                List.of("Math", "Physics", "History"),
                List.of("Reading", "Hiking", "Music")));

        students.add(new Student("Anton", 22, 54321, 8.0, "Pushkin Allee, 5",
                List.of("Chemistry", "Biology"),
                List.of("Painting")));

        System.out.println("before serialization"+ students);
        String fileName= "students.ser";

       // updateInfo();

        serializeStudents(fileName, students); // call serilization method.


        List<Student> deserializedStudents = deserializeStudent(fileName, students);// Deserialize and print the list of students
        for (Student student :deserializedStudents) {
            System.out.println("Deserialized Student: " + student);
        }
    }
   /* public static void updateInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to update info? yes/no");
        String str = scanner.nextLine();
        if (str.equalsIgnoreCase("yes")) {
            System.out.println("give a new info about GPA:  ");
            String newGpa = scanner.nextLine();
            System.out.println("courses: ");
            List<String> course = scanner??
            List<String> hobby = scanner.??

        }
    }*/

    public static void serializeStudents(String fileName, List<Student> students) throws IOException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        }
    }

    public static List<Student> deserializeStudent(String fileName, List<Student> students) throws IOException , ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            List<Student> deserializestudent = (List<Student>) ois.readObject();
            return deserializestudent;
        }
    }
}
class Student implements Serializable {
    private String name;
    private int age;
    private int id;
    private double gpa;
    private String address;
    List<String> course;
    List<String> hobby;

    public Student(String name, int age, int id, double gpa, String address, List<String> course, List<String> hobby) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
        this.address = address;
        this.course = course;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gpa=" + gpa +
                ", address='" + address + '\'' +
                ", course=" + course +
                ", hobby=" + hobby +
                '}';
    }
}

