package org.example.Class2510;

import java.util.Calendar;
import java.util.Scanner;

// Create a function that calculates and displays the user's age category
//(e.g., child, teenager, adult, senior) based on their age.
public class E8 {
    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if( age >0 && age<13){
            System.out.println(" You are a child");
        } else if (age>=13 && age <18) {
            System.out.println(" You are a teenager");
        } else if (age>=18 && age <60) {
            System.out.println(" You are an adult");
        }else if (age>=60 ) {
            System.out.println(" You are a senior");
        }else if (age<0 ) {
            System.out.println(" something wrong, age can not be a negative number!");
        }
        int yearOfBerth = currentYear - age;
        System.out.println("You was born in " + yearOfBerth );

    }
}
