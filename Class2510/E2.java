package org.example.Class2510;

import java.io.*;
import java.util.Scanner;

// Allow the user to update their email, phone number, and address in
//the program, write it to the file, and display the updated information.
public class E2 {
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
        System.out.println("WE want update information about you");
        System.out.println("Phone number");
        String newPhone = scanner.nextLine();
        System.out.println("Email");
        String newemail = scanner.nextLine();
        System.out.println("PAddress");
        String newAddress = scanner.nextLine();

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
    }
}
