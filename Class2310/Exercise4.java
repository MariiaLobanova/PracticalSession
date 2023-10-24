package org.example.Class2310;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I need some information about you! Give me your name: ");
        String name = scanner.nextLine();

        int age = 0;
        boolean isValidAge = false;
        while (!isValidAge) {
            try {
                System.out.println("your age:");
                age = scanner.nextInt();
                scanner.nextLine();

                if (age > 0) {
                    isValidAge = true;
                } else {
                    System.out.println("incorrect age data");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalia input");
            }
        }

        System.out.println("phone number: ");
        String phone = scanner.nextLine();

        System.out.println("email address: ");
        String email = scanner.nextLine();

        System.out.println("Address: ");
        String address = scanner.nextLine();


        System.out.println("Now I have all about you:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(address);

        saveUserInfo(name, age, email, phone, address);

        scanner.close();

    }
    public static void saveUserInfo(String name, int age, String email, String phone, String address){
        try(FileWriter writer = new FileWriter("org/example/Class2310/userData.text")){
            writer.write("Name: " + name+ System.lineSeparator());
            writer.write("age: " + age +System.lineSeparator());
            writer.write("phone number: " + phone+ System.lineSeparator());
            writer.write("email: " + email +  System.lineSeparator());
            writer.write("address: " + address +  System.lineSeparator());
        } catch (IOException e) {
            System.out.println("error occurred while writing");
        }
    }
}
