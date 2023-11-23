package FunctionsAssignment;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class MaxandMin {

    static void findMaxnum() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers to find the max in those: ");

        System.out.print("Enter first no: " );
        int a = input.nextInt();

        System.out.print("Enter second no: " );
        int b = input.nextInt();

        System.out.print("Enter third no: " );
        int c = input.nextInt();

        if (a > b && a > c){
            System.out.println("The largest no is: "+ a);
        } else if (b > a && b > c) {
            System.out.println("The largest no is: "+ b);
        } else {
            System.out.println("The largest no is: "+ c);
        }


    }

    private static void findMinnum() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers to find the min in those: ");

        System.out.print("Enter first no: " );
        int a = input.nextInt();

        System.out.print("Enter second no: " );
        int b = input.nextInt();

        System.out.print("Enter third no: " );
        int c = input.nextInt();

        if (a < b && a < c){
            System.out.println("The smallest no is: "+ a);
        } else if (b < a && b < c) {
            System.out.println("The smallest no is: "+ b);
        } else {
            System.out.println("The smallest no is: "+ c);
        }

    }
    public static void main(String[] args) {

        findMaxnum();

        findMinnum();

    }

}
