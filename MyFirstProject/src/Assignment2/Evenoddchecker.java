package Assignment2;

// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Evenoddchecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to know if it is even or odd: ");

        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("The entered number" + " " + num + " " + "is even");
        } else {
            System.out.println("The entered number" + " " + num + " " + "is odd");
        }

    }
}
