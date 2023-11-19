package Assignment3;

import java.util.Scanner;

public class Check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of digits to work on: ");

        int n = input.nextInt();
        int negative = 0;
        int even = 0;
        int odd =0;

        for (int i = 1; i <=n ; i++) {

            System.out.print("Enter a number: ");
            int s = input.nextInt();

            if (s != 0) {

                if (s < 0) {
                    negative = negative + s;
                }

                if (s % 2 == 0) {
                    even = even + s;
                } else {
                    odd = odd + s;
                }
            }else {
                break;
            }

        }
        System.out.println("Entered zero so exiting");
        System.out.println("The sum of negative numbers is: " + negative);
        System.out.println("The sum of positive even numbers is: " + even);
        System.out.println("The sum of positive odd numbers is: " + odd);
    }
}
