package Assignment1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");

        int year = input.nextInt();

        if ( year % 4 == 0){
            System.out.println("It is a leap year");
        }else {
            System.out.println("It is not a leap year");
        }

    }
}
