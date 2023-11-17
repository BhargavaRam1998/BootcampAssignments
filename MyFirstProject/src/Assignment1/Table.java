package Assignment1;

import java.util.Scanner;

public class Table {

    static void multiply(int n){

        int c = 1;

        while (c <= 10) {

            int value = n * c;

            System.out.println(n + " " + "X" + " " + c + " " + "=" + " " + value);

            c++;

        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to get its table: ");

        int num = input.nextInt();

        multiply(num);

    }
}
