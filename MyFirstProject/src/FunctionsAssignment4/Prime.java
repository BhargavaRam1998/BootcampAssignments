package FunctionsAssignment;

//Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        isPrimeornot();
    }

    static void isPrimeornot() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find out if it is a prime number or not: ");

        int num = input.nextInt();

        if (num > 1){
            if ((num % 2 == 0) && (num % Math.sqrt(num) == 0)){
                System.out.println("The given number is not a prime number");
            }else {
                System.out.println("The given number is a prime number");
            }

        }else {
            System.out.println("The entered num is 1, so please enter a whole number greater than 1");
        }

    }
}
