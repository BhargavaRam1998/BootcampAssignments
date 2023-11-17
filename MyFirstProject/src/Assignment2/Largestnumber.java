package Assignment2;

import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class Largestnumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");

        double num2 = input.nextDouble();

        if (num1>num2){
            System.out.println("The largest number is: " + num1);
        }else {
            System.out.println("The largest number is: " + num2);
        }
    }
}
