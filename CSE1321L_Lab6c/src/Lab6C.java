/*
Class: CSE 1321L
Section: WJ1
Term: Spring 2022
Instructor: Gayathri, Yella
Name: Briana O'Neal
Lab#: CSE1321L.Lab6C
 */

import java.util.Scanner;
public class Lab6C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("You have $1000 in your account.");
        int userBalance = 1000;
        char userAnswer;
        do {
            System.out.println("\nMenu\n0 - Make a deposit\n1 - Make a withdrawal\n2 - Display account value");
            System.out.print("\nPlease make a selection: ");
            int userInput = scan.nextInt();

            switch (userInput){
                case 0:
                    System.out.print("How much would you like to deposit? : ");
                    userInput = scan.nextInt();
                    userBalance = userBalance + userInput;
                    System.out.println("Your current balance is $" + userBalance);
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    userAnswer = scan.next().toLowerCase().charAt(0);
                    break;
                case 1:
                    System.out.print("How much would you like to withdraw? : ");
                    userInput = scan.nextInt();
                    userBalance = userBalance - userInput;
                    System.out.println("Your current balance is $" + userBalance);
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    userAnswer = scan.next().toLowerCase().charAt(0);
                    break;
                case 2:
                    System.out.println("Your current balance is $" + userBalance);
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    userAnswer = scan.next().toLowerCase().charAt(0);
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    userAnswer = scan.next().toLowerCase().charAt(0);
                    break;
            }


        } while (userAnswer == 'y');
        System.out.println("\nThank you for banking with us!");
    }
}
