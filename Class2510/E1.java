package org.example.Class2510;

import java.io.*;

// Extend your program to read and display the user's phone number
//and address from the file using FileInputStream. Add error handling
//for file input in case the file does not exist or is empty.
public class E1 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream= new FileInputStream("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2510/file.txt");
            InputStreamReader inputStreamReader= new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String phoneNumber = bufferedReader.readLine();
            String address = bufferedReader.readLine();

            if( phoneNumber!=null&& address!=null){
                System.out.println(phoneNumber);
                System.out.println(address);
            }else {
                System.out.println("File is empty");
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
