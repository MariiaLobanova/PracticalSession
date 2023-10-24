package org.example.Class2310;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("org/example/Class2310/userData.text"))) {
            String line;
            System.out.println("User info: ");
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("an error occurred while reading the file");
        }

    }

}
