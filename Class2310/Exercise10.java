package org.example.Class2310;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// Create a summary report at the end of the program that displays all
//the user's entered information, including name, age, email, phone
//number, birth year, gender, and favorite color.
public class Exercise10 {
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

            String email = null;
            boolean isValidEmail=false;
            while(!isValidEmail){
                try {System.out.println("email address: ");
                    email = scanner.nextLine();

                    if(email.contains("@")&&email.contains(".")){
                        isValidEmail =true;
                    } else{
                        System.out.println("Email is not valid");
                    }

                } catch (Exception c){
                System.out.println( "Error!");
                }
            }


            System.out.println("Address: ");
            String address = scanner.nextLine();

            System.out.println("your gender ");
            String gender = scanner.nextLine();

            System.out.println("your favorite color ");
            String color = scanner.nextLine();

            System.out.println("Now I have all about you:");
            System.out.println(name);
            System.out.println(age);
            yearOfBirth(age);
            System.out.println(email);
            System.out.println(phone);
            System.out.println(address);
            System.out.println(gender);
            System.out.println(color);

            saveUserInfo(name, age, email, phone, address, gender, color);




            scanner.close();

        }
        public static void saveUserInfo(String name, int age, String email, String phone, String address, String gender, String color){
            try(FileWriter writer = new FileWriter("org/example/Class2310/userData.text")){
                writer.write("Name:  " + name+ System.lineSeparator());
                writer.write("age:  " + age +System.lineSeparator());
                writer.write("year of birth:  "+yearOfBirth(age)+ System.lineSeparator());
                writer.write("phone number:  " + phone+ System.lineSeparator());
                writer.write("email:  " + email +  System.lineSeparator());
                writer.write("address:  " + address +  System.lineSeparator());
                writer.write("gender:  "+ gender+ System.lineSeparator());
                writer.write("favorite color:  " + color +  System.lineSeparator());

            } catch (IOException e) {
                System.out.println("error occurred while writing");
            }
        }
        public static int yearOfBirth(int age){
            int yearBirth;
            int CurrentYear = 2023;
            yearBirth= CurrentYear - age;
            System.out.println("a year of bith " + yearBirth );
            return yearBirth;
        }
}


