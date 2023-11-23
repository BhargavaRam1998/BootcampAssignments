package FunctionsAssignment;


//Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;

public class PrimeinbetweenTwonumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to find out prime numbers between them");

        System.out.print("Enter first number: ");

        int num1 = input.nextInt();

        System.out.print("Enter second number: ");

        int num2 = input.nextInt();

        calculate(num1, num2);
    }

    public static void calculate(int n1, int n2){

        for (int i = n1 + 1; i < n2; i++){

            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){

        if (num < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
