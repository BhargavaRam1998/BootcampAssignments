package Assignment3;

//Reverse A String In Java
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String s = input.next();
        String result = " ";

        for (int i = s.length() - 1; i >=0 ; i--) {
            char p = s.charAt(i);

            result = result + p;

        }

        System.out.println("The reversed string is: " + result);
    }
}
