package Assignment3;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = input.nextInt();

        int result = 0;

        while (num > 0){
            int rem = num % 10;

            result = result * 10 + rem;

            num /= 10;

        }
        System.out.println(result);
    }
}
