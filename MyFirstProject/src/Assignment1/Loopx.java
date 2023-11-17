package Assignment1;

import java.util.Scanner;

public class Loopx {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.print("Enter a number or X to find the sum: ");
            if(input.hasNextInt()){
                sum = sum + input.nextInt();
            } else if (input.next().equalsIgnoreCase("X")) {
                break;
            } else{
                System.out.println("Please enter either number of X");
            }

        }
        System.out.println("The total sum is: " + sum);
    }
}
