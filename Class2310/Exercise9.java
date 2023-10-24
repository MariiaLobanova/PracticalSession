package org.example.Class2310;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite color?");

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");


        for (int i = 0; i < colors.size(); i++) {
            System.out.println((i + 1) + " - " + colors.get(i));

        }System.out.println("Type a number of color: ");
        int index;

        while (true) {
            index = scanner.nextInt();

            if (index >= 1 && index <= colors.size()) {
                System.out.println("Great! Your color id " + colors.get(index - 1));
                break;
            } else {
                System.out.println("you are probably made a mistake! Try one more time");

            }

        }scanner.close();
    }
}