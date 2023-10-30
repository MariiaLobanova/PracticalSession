package org.example.Class2710;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable{
        private String name;
        private int age;
        private int id;
        private List<String> hobbies;
        private double gpa;
        private List<String> courses;
    private static final long serialVersionUID = -3885559428706676636L;



    public Student(String name, int id,  int age, List<String> hobbies, double gpa, List<String> courses) {
            this.name = name;
            this.age = age;
            this.hobbies = new ArrayList<>(hobbies);
            this.id = id;
            this.gpa = gpa;
            this.courses = new ArrayList<>(courses);
        }
    public Student(String name, int id,  int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", studentID='" + id + '\'' +
                ", hobbies=" + hobbies + ", gpa=" + gpa + ", courses=" + courses + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String courses) {
            this.courses.add(courses.toString());
    }
    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }
}
