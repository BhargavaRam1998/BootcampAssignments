package Assignment2;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String s = input.next();

        int n = 0;

        int l = s.length() - 1;

        boolean ispalindrome = false;

        while (s.charAt(n) == s.charAt(l)) {

            if (n == l) {
                System.out.println("The given string is palindrome");
                ispalindrome = true;
                break;
            }
            n++;
            l--;

        }

        if (!ispalindrome){
            System.out.println("The given string is not a palindrome");
        }

    }
}

