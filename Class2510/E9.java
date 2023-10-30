package org.example.Class2510;

import java.io.*;

// Implement a feature that displays the total number of interactions
//(e.g., how many times the program has been run) in the log file.
public class E9 {
    public static void main(String[] args) {
        try{
        FileInputStream fileInputStream= new FileInputStream("src/main/java/org/example/Class2510/file.txt");
            InputStreamReader isr = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(isr);

            int totalIteraction = 0;
            while (br.readLine()!=null) {
            totalIteraction ++;

            }
            System.out.println(totalIteraction);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
