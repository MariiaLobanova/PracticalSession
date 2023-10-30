package org.example.Class2510;

// Implement the ability to delete a user's information from the file if
//requested by the user.

import java.io.*;
import java.util.Scanner;

public class E3 {
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
        System.out.println("would you like to delite info? yes/ no");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")){
            try{
                FileWriter fw = new FileWriter("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2510/UserInfo.txt");
                fw.write("");
                fw.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("UserInfo.txt is empty");
        } else {
            System.out.println("We keep information. Thank you!");
        }
    }
}


