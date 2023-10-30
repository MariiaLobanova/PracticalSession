package org.example.Class2410;

import java.io.*;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter file name to read/write data: ");
        String fileName = scanner.nextLine();

       try{ BufferedReader reader = new BufferedReader(new FileReader(fileName));
               String line;
               while((line= reader.readLine())!=null){
                   System.out.println(line);
               }
               reader.close();

    } catch (IOException e) {
           System.out.println(e.getMessage());
       }
    }
}
