package Assignment3;

import java.util.Scanner;

public class CheckNumberPalindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find out if it is a palindrome or not: ");

        int n = input.nextInt();
        int test = n;
        int result =0;

        while (n > 0){

            int rem = n % 10;

            result = result * 10 + rem;

            n /= 10;
        }

        if (result == test){
            System.out.println("The entered number is a palindrome");
        }else {
            System.out.println("The entered number is not a palindrome");
        }
    }
}
