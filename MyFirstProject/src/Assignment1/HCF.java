package Assignment1;

import java.util.Scanner;

// *********************Logic needs correction******************************

public class HCF {

    static void Highcommonfactor(int n1, int n2){

        int n = 1;

        if (n1 > n2){
            int r = n1 % n2;

            if (r == 0){
                System.out.println("The highest common factor is: " + n);
            }else {
                while (r != 0){
                    r = n2 % r;
                    n = n + 1;
                }
            }
            System.out.println("The highest common factor is: " + n);
        }else {
            int r = n2 % n1;
            if (r == 0){
                System.out.println("The highest common factor is: " + n);
            }else {
                while (r != 0){
                    r = n1 % r;
                    n = n + 1 ;
                }
            }
            System.out.println("The highest common factor is: " + n);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int num1 = input.nextInt();

        System.out.print("Enter Second number: ");

        int num2 = input.nextInt();

        Highcommonfactor(num1, num2);
    }
}
