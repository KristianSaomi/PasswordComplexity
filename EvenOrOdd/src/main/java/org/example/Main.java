package org.example;

import java.util.Scanner;

public class Main {
    static int newCounter = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Enter a number:  ");
        int userNum = scanner.nextInt();
        System.out.println("Is the number even: " + isEven(userNum));
         */

        //Is password complex?
        System.out.println("Enter a password");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? " +  isPasswordComplex(userInput));
        System.out.println("Is the password complex? " + isItReallyComplex(userInput));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    //Use Modular operator
    // 4 % 2 = 0;
    // 3 % 2 = 1;
    // 6 & 2 = 0;

    public static boolean isPasswordComplex (String password) {
        boolean hasLowerCaseLetter = false;
        boolean hasUpperCaseLetter = false;
        boolean hasNumber = false;
        boolean threeLowerCase = false;
        int count = 0;

        if (password.length() < 6) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);

            if (Character.isDigit(current)) {
                hasNumber = true;
            } else if (Character.isUpperCase(current)) {
                hasUpperCaseLetter = true;
            } else if (Character.isLowerCase(current)) {
                hasLowerCaseLetter = true;
                newCounter = count++;
                if (count == 3) {
                    threeLowerCase = true;
                }
            }
        }
        System.out.println(password + "have " + newCounter + " lowercase letters");
        return hasNumber && hasLowerCaseLetter && hasUpperCaseLetter && threeLowerCase;
        /*
        Simpler implementation with pathern matching and redex

         */
    }
    public static boolean isItReallyComplex(String password) {
        return password.length() >=6 &&
                password.matches(".*\\d.*") &&  //Strings atleast 1 number
                password.matches(".*[a-z].*") && //String atleast 1 lowercase
                password.matches(".*[A-z].*"); //String atleast 1 uppercase
    }


}