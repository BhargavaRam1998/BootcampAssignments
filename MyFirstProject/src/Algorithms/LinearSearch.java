package Algorithms;

public class LinearSearch {

    public static void FindElement(int[] arr, int n) {

        for (int x : arr) {
            if (x == n) {
                System.out.println("The desired element is found");
            }
        }

    }
    public static void main(String[] args) {

        int[] array = {14, 9, 6, 3, 11, 22};

        int num = 3;

        FindElement(array, num);

    }
}
