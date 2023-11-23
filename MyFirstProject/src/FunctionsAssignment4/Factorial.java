package FunctionsAssignment;
/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
 */
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

       int value =  factor();

        System.out.println("The factorial of given number is: " + value);
    }

    static int factor() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to know it's factorial: ");

        int num = input.nextInt();
        int s = 1;
        int result =1;

        if (num == 1 || num == 0){
            return 1;
        }else {
            while (s <= num) {
                result = result * s;
                s++;
            }
        }

        return result;
    }
}
