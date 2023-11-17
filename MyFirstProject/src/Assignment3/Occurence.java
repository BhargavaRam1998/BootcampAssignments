package Assignment3;

import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find out how many times 5 is repeated in it: ");

        int num = input.nextInt();
        int count = 0;

        while (num > 0) {

            int rem = num % 10;

            if (rem ==5){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
