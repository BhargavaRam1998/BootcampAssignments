package Assignment3;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements to find the average: ");
        int n = input.nextInt();
        double sum = 0;

        System.out.print("Enter the elements to find their average: ");

        for (int i = 0; i <= n; i++) {

            sum = sum + input.nextDouble();

        }

        double avg = sum / n;

        System.out.println("The avereage of" +" "+ n +" " +  "numbers is: " + avg);
    }
}
