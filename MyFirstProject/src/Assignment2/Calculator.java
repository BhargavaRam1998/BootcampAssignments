package Assignment2;

import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");

        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");

        double num2 = input.nextDouble();

        input.nextLine();

        System.out.print("Enter one of the following operators +, -, *, /: ");

        String operator = input.nextLine();


        if (operator.equals("+")){
            double value = num1 + num2;
            System.out.println("The sum of two numbers is: " + value);
        } else if (operator.equals("-")) {
            double value = num1 - num2;
            System.out.println("The subtraction of two numbers is: " + value) ;
        } else if (operator.equals("*")) {
            double value = num1 * num2;
            System.out.println("The multiplication of two numbers is: " + value) ;
        } else if (operator.equals("/")) {

             if(num2 != 0) {
                 double value = num1 / num2;
                 System.out.println("The division of two numbers is: " + value);
            }else {
                 System.out.println("Error: division by zero");
             }

        }
    }
}
