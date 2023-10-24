package org.example.Class2410;

// Read the content of an input text file named "input.txt."
//Transform the text in the following way:
//Convert all text to uppercase.
//Replace all occurrences of "JAVA" with "Python."
//Write the transformed text to an output text file named "output.txt.”

import java.io.*;

public class EM {
    public static void main(String[] args) {

        try (FileReader reader= new FileReader("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2410/input.txt")){
            BufferedReader bufferedReader= new BufferedReader(reader);
            StringBuilder inputText= new StringBuilder();

            String line;
            while((line = bufferedReader.readLine())!=null){
                inputText.append(line).append("\n");
            }

            String newText = inputText.toString().toUpperCase();

            try(BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/maria/Desktop/Workspace/PracticalSession/src/main/java/org/example/Class2410/output.txt"))) {
                writer.write(newText);
            }
            System.out.println("new text is added in outputfile"  );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
