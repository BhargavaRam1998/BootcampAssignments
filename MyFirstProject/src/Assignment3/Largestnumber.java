package Assignment3;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class Largestnumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int p = 0;
        int s;

        do{
            System.out.print("Enter a number: ");
            s = input.nextInt();
            if (s > p){
                p = s;
            }
        } while (s != 0);

        System.out.println("The largest in the previously entered number is: " + p);

    }
}
