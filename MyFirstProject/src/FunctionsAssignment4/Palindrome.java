package FunctionsAssignment;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number to find out it it is a palindrome or not: ");

        int n = input.nextInt();
        Checkifpalindrome(n);
    }

    public static void Checkifpalindrome(int num){

        int test_value = num;
        int result = 0;

        while (num > 0) {
            int rem = num % 10;
            result = result * 10 + rem;

            num /= 10;
        }

        if (test_value == result){
            System.out.println("The given number is a palindrome");
        }else {
            System.out.println("The given number is not a palindrome");
        }
    }
}
