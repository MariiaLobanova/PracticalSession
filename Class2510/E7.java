package org.example.Class2510;

import java.io.*;
import java.util.Scanner;

// Add a confirmation step before updating or deleting user data to
//ensure the user's intent.
public class E7 {
    public static void main(String[] args) {
        String phone;
        String email;
        String address;

        try {
            FileReader fileReader = new FileReader("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2510/UserInfo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            phone = bufferedReader.readLine();
            email =bufferedReader.readLine();
            address = bufferedReader.readLine();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current information:");
        System.out.println(phone);
        System.out.println(email);
        System.out.println(address);

        Scanner scanner = new Scanner(System.in);
        System.out.println("WE want to update information about you");
        System.out.println();
        System.out.println("Give your phone number");
        String newPhone = scanner.nextLine();
        System.out.println("Email");
        String newemail = scanner.nextLine();
        System.out.println("Address");
        String newAddress = scanner.nextLine();

        System.out.println(" Are you sure you want to update your information ?");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")){

        try{
            BufferedWriter bufferedWriter= new BufferedWriter( new FileWriter("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2510/UserInfo.txt"));
            bufferedWriter.write(newPhone);
            bufferedWriter.newLine();
            bufferedWriter.write(newemail);
            bufferedWriter.newLine();
            bufferedWriter.write(newAddress);

            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }else {
            System.out.println("Okay next time!");}
    }
}

