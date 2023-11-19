package Assignment3;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Checkzero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int s;
        int result = 0;

        do{
            System.out.print("Enter a number: ");
             s = input.nextInt();
             result = result + s;
        }while (s != 0);

        System.out.println("The sum of all previously entered numbers is: " + result);

    }
}
