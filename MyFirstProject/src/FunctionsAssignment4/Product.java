package FunctionsAssignment;


import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Product {

    public static void main(String[] args) {

       int result =  producofNumbers();

        System.out.println("The product of two numbers is: " + result);
    }

    static int producofNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int a = input.nextInt();

        System.out.print("Enter second number: ");

        int b = input.nextInt();

        int c = a * b;

        return c;

    }
}
