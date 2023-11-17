package Assignment2;

//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = input.nextInt();

        System.out.print("The fibonacci series is: ");
        int firstnum = 1; int secondnum = 1;

        for(int i=1; i<=num; ++i){

            System.out.print(firstnum + " ");

            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;

        }
    }


}
