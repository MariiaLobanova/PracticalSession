package org.example.Class2410;

// Extend your program to read and display the user's phone number
//and address from the file using FileInputStream. Add error handling
//for file input in case the file does not exist or is empty.

import java.io.*;

public class E1 {
    public static void main(String[] args) {
        try (
            FileInputStream fileInputStream = new FileInputStream("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2310/userData.text")){
            InputStreamReader isr = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(isr);

            String line;
            String phone = null;
            String address = null;

            while ((line = reader.readLine())!=null){
                if(line.contains("phone number")){
                    phone = line.substring(line.indexOf(":")+1);
                }else if(line.contains("address")){
                    address = line.substring(line.indexOf(":")+1);
            }
            }
            reader.close();
            System.out.println("Phone Number: " + phone);
            System.out.println("Address: " + address);

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

