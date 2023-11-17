package Assignment2;

//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");

        String name = input.next();

        System.out.println("How are you" + " " + name);
    }
}
