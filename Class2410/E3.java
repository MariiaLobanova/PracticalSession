package org.example.Class2410;
import java.io.*;
import java.util.Scanner;
public class E3 {
        public static void main(String[] args) {
            try (FileInputStream fileInputStream = new FileInputStream("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2410/dataUser.txt")) {
                InputStreamReader isr = new InputStreamReader(fileInputStream);
                BufferedReader reader = new BufferedReader(isr);

                String phone = reader.readLine();
                String email = reader.readLine();
                String address = reader.readLine();

                System.out.println("Information about User:");
                System.out.println(phone);
                System.out.println(email);
                System.out.println(address);

                Scanner scanner = new Scanner(System.in);
                System.out.println("Would you like to delete some information? (yes or no): ");
                String input = scanner.nextLine();
                int choice = 0;
                if (input.equalsIgnoreCase("yes")) {
                    System.out.println("Type a number to choose what you want to delete.");
                    System.out.println("1 - phone number; 2 - email; 3 - address");

                    choice = scanner.nextInt();
                    StringBuilder updateContent = new StringBuilder();

                    // Skip the first three lines in the file
                    reader.readLine();
                    reader.readLine();
                    reader.readLine();

                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (choice == 1 && !line.startsWith("Phone: ")) {
                            if (updateContent.length() > 0) {
                                updateContent.append("\n");
                            }
                            updateContent.append(line);
                        } else if (choice == 2 && !line.startsWith("Email: ")) {
                            if (updateContent.length() > 0) {
                                updateContent.append("\n");
                            }
                            updateContent.append(line);
                        } else if (choice == 3 && !line.startsWith("Address: ")) {
                            if (updateContent.length() > 0) {
                                updateContent.append("\n");
                            }
                            updateContent.append(line);
                        }
                    }

                    try (FileWriter writer = new FileWriter("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2410/dataUser.txt");
                         BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                        bufferedWriter.write(updateContent.toString());
                        System.out.println("Information was deleted successfully");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }




