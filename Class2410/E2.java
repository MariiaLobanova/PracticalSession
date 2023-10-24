package org.example.Class2410;

import java.io.*;
import java.util.Scanner;

//Allow the user to update their email, phone number, and address in
//the program, write it to the file, and display the updated information.
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileInputStream fileInputStream = new FileInputStream("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2410/dataUser.txt")) {
            InputStreamReader isr = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(isr);

            String email = reader.readLine();
            String phone = reader.readLine(); ;
            String address = reader.readLine();
            System.out.println("Curren information: ");
            System.out.println("Your Email: "+ email + "  Phone number"+ phone+ "  Adress: "+ address);


            System.out.println("Enter your new email ");
            String newEmail= scanner.nextLine();

            System.out.println("Enter your new phone number ");
            String newPhone= scanner.nextLine();

            System.out.println("Enter your new address ");
            String newAddress= scanner.nextLine();

            FileWriter writer = new FileWriter("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2410/dataUser.txt");
            writer.write("phone number: " + newPhone + "\n");
            writer.write("email: " + newEmail + "\n");
            writer.write("address: " + newAddress);
            writer.close();

            System.out.println("Information was updated");
            System.out.println("Updated information: phone number " + newPhone);
            System.out.println("email  " + newEmail);
            System.out.println("address " + newAddress);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
