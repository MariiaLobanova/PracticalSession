package org.example.Class2510;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E11 {
    // Modify your program to create a list of users' names, ages, emails,
    //phone numbers, and addresses. Save it to a CSV file using FileWriter.
    //Each line should represent one user's data.
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name= scanner.nextLine();
        System.out.println("age? ");
        String age= scanner.nextLine();
        System.out.println("email? ");
        String email= scanner.nextLine();
        System.out.println("phone number? ");
        String phoneNumber= scanner.nextLine();
        System.out.println("address? ");
        String address= scanner.nextLine();

        try {FileWriter fileWriter = new FileWriter("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2510/userInfo.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String newLine = null;
            bufferedWriter.write(" Name: " + name + newLine);
            bufferedWriter.write("Age: " + age + newLine);
            bufferedWriter.write("Phone number: "+phoneNumber + newLine);
            bufferedWriter.write("Email: "+email + newLine);
            bufferedWriter.write("Address: "+ address + newLine);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
 */
        List<User> users = new ArrayList<>();
        users.add(new User("John Doe",
                30,
                "john.doe@example.com",
                "123-456-7890",
                "123 Main St, Cityville"));
        users.add(new User("Alice Smith",
                25,
                "alice.smith@example.com",
                "987-654-3210",
                "456 Elm St, Townsville"));

        String csvFile = "userinfo.csv";
        try (FileWriter writer = new FileWriter(csvFile)) {
// Writing CSV header
            writer.append("Name,Age,Email,Phone,Address\n");

// Writing user data to CSV
            for (User user : users) {
                writer.append(user.getName())
                        .append(",")
                        .append(String.valueOf(user.getAge()))
                        .append(",")
                        .append(user.getEmail())
                        .append(",")
                        .append(user.getPhoneNumber())
                        .append(",")
                        .append(user.getAddress())
                        .append("\n");
            }
            System.out.println("CSV file has been created successfully!");
            System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
        } catch (IOException e) {
            System.out.println("Error occurred while writing to the CSV file: " +
                    e.getMessage());
        }
    }
}
