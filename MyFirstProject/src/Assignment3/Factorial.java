package Assignment3;

import java.util.Scanner;

public class Factorial {

    public int find_factorial(int s){

        int result = 1;

        for (int i = s; i >0 ; i--) {

            result = result * i;

        }

        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find out its factorial: ");
        int n = input.nextInt();

        Factorial obj = new Factorial();

        int final_result = obj.find_factorial(n);

        System.out.println("The factorial of given number is: " + final_result);
    }
}
