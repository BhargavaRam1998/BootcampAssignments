package FunctionsAssignment;


/*
Write a function to check if a given triplet is a Pythagorean triplet or not.
(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
 */

import java.util.Scanner;

public class Triplet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a triplet number: ");

        int n = input.nextInt();

        findIfTriplet(n);
    }

    public static void findIfTriplet(int num) {
        int rem = num % 10;
        int rhs = rem * rem;

        num /= 10;

        rem = num % 10;
        int lhs = rem * rem;
        num /= 10;

        rem = num % 10;

        lhs = lhs + rem * rem;

        if (lhs == rhs){
            System.out.println("The provided triplet is a Pythagorean triplet");
        }else{
            System.out.println("The provided triplet is not a Pythagorean triplet");
        }
    }
}
