package FunctionsAssignment;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Circle {

    public static void main(String[] args) {
        allAboutCircle();
    }

    static void allAboutCircle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");

        float radius = input.nextFloat();

        float circumference = 2 * 3.14f * radius;

        float area = 3.14f * radius * radius;

        System.out.println("The circumference of the circle with give radius is: " + circumference);

        System.out.println("The area of the circle with the given radius is: " + area);
    }
}
