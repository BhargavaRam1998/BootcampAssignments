package FunctionsAssignment;

//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int num1 = input.nextInt();

        System.out.print("Enter second number: ");

        int num2 = input.nextInt();

        sumofNumbers(num1, num2);
    }

    static void sumofNumbers(int a, int b) {

        int c = a + b;
        System.out.println("The sum of two numbers is: " + c);

    }
}
