package Assignment2;

//Input currency in rupees and output in USD.
import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter currency in rupees: ");

        int rupees = input.nextInt();

        int USD = rupees / 83; //1 USD is equal to 83 Indian rupees

        System.out.println(rupees + " " + "rupees is equal to" + " " + USD + " " + "US dollars");
    }
}
