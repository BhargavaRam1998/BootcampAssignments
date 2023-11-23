package FunctionsAssignment;

import java.util.Scanner;

public class Naturalnumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = input.nextInt();

        sum(n);
    }

    public static void sum(int n){

        int s = 0;
        int result = 0;

        if (n < 1){
            System.out.println("Please enter a positive number");
        }else{
            while (s <= n){
                result = result + s;
                s++;
            }
            System.out.println("The sum of natural numbers until the entered number is: " + result);
        }

    }
}
