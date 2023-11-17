package Assignment2;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = input.nextInt();

        int sum = 0;

        String s = String.valueOf(num);

        int digits_count = s.length();

        for (int i =0; i<s.length(); i++){
            char digitchar = s.charAt(i);

            int n = Character.getNumericValue(digitchar);

           int value = (int) Math.pow(n,digits_count);

            sum += value;
        }

        if (sum == num){
            System.out.println("The given number is an armstrong number");
        }else {
            System.out.println("The given number is not an armstrong number");
        }


    }
}
