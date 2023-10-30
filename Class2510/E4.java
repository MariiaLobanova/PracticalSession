package org.example.Class2510;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Create a log file that records all user interactions with your program,
//including timestamps.
public class E4 {
    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String logMessage = "User interaction at " + dateFormat.format(new Date());

            FileWriter logWriter = new FileWriter("log.txt", true);
            logWriter.write(logMessage + "\n");
            logWriter.close();

            System.out.println("Log entry added: " + logMessage);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
