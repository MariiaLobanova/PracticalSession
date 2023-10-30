package org.example.Class2710;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// Create a backup of the serialized data for disaster recovery purposes.
public class E5 {
    public static void main(String[] args) {
        try {
            Path originaleFile = Paths.get("studemt_data.ser");
            Path backupFile = Paths.get("studemt_data_buckup.ser");

            Files.copy(originaleFile,backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Backup crated succesfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


