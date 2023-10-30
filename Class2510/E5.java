package org.example.Class2510;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

// Implement a feature that allows the user to specify the name of the
//file where their data will be stored and read from.
public class E5 {
    public static void main(String[] args) {
        try{
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Name a file for reading and storing information");
            String fileName = bufferedReader.readLine();

            FileInputStream fileInputStream= new FileInputStream(fileName);
            System.out.println("Operation completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
