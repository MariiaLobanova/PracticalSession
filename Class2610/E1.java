package org.example.Class2610;

import java.io.*;
import java.util.List;

// Create a more complex class (e.g., Student) with additional attributes
//like address, GPA, a list of courses taken, and a list of hobbies.
//Implement serialization for this class.
public class E1 {

    public static void main(String[] args) {
        Person person1 = new Person("Anna", 27, 12345, 9.5, "Brandenburger str.1",
                List.of("Math", "Physics", "History"),
                List.of("Reading", "Hiking", "Music"));
        Person person2 = new Person("Anton", 22, 54321, 8.0, "Pushkin Allee, 5",
                List.of("Chemistry", "Biology"),
                List.of("Painting"));

        System.out.println("Before serialization 1: "+ person1);
        System.out.println("Before serialization 2: "+ person2);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("students.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        try {
        FileInputStream fileInputStream = new FileInputStream("students.txt");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            Person deserialPerson1 = (Person) ois.readObject();
            Person deserialPerson2 = (Person) ois.readObject();

            ois.close();

            System.out.println("Deserialized Person 1: " + deserialPerson1);
            System.out.println("Deserialized Person 2: " + deserialPerson2);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}


class Person implements Serializable {
    private String name;
    private int age;
    private int id;
    private double gpa;
    private String address;
    List<String> course;
    List<String> hobby;

    public Person(String name, int age, int id, double gpa, String address, List<String> course, List<String> hobby) {
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

