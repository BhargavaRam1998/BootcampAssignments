package FunctionsAssignment;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the age to know if he/she is eligible to vote: ");

        int age = input.nextInt();

        if (isEligible(age)){
            System.out.println("The person is eligible to vote");
        }else {
            System.out.println("The person is not eligible to vote");
        }
    }

    static boolean isEligible(int age) {

        return age >= 18;
    }
}
