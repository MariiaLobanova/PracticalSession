package org.example.Class2310;

import java.util.Scanner;

public class Exercise1 {
    // Create a Java program that collects the user's:
//
//- name
//- age
//- email address
//- phone number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I need some information about you! Give me your name: ");

        String name = scanner.nextLine();

        System.out.println("age: ");
        int age = scanner.nextInt();

        System.out.println("phone number: ");
        String phone = scanner.nextLine();

        System.out.println("email address: ");
        String email = scanner.nextLine();



        System.out.println("Now I have all about you:");
        System.out.println(name);
        System.out.println( age);
        System.out.println(email);
        System.out.println(phone);

        scanner.close();

    }


}

