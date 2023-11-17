package Assignment2;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");

        int principal = input.nextInt();

        System.out.print("Enter Time in years: ");

        int time = input.nextInt();

        System.out.print("Enter Rate: ");

        float rate = 0.01f * input.nextInt();

        float interest = principal * rate * time;

        float final_amount = principal + interest;

        System.out.println("The simple interest is: " + " " + interest);

        System.out.println("Total amount with interest is " + final_amount);


    }

}
