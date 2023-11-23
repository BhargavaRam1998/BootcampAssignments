package FunctionsAssignment;

import java.util.Scanner;

public class Evenorodd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find out if it is even or odd: ");

        int num = input.nextInt();

        boolean s = findevenOdd(num);

        if (s){
            System.out.println("The given no is an even number");
        }else {
            System.out.println("The given no is an odd number");
        }
    }

    private static boolean findevenOdd(int num) {

        return num % 2 == 0;
    }
}
