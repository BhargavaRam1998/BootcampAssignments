package Algorithms;

import java.util.Arrays;

public class Selectionsort {

    public static int[] selectionSort(int[] s){

        for (int i=0; i<s.length; i++) {
            int mini = i;
            for (int j=i; j<s.length; j++) {
                if (s[j] < s[mini]) {
                    mini = j;
                }
            }

            int temp = s[mini];
            s[mini] = s[i];
            s[i] = temp;
        }

        return s;

    }

    public static void main(String[] args) {

        int[] arr = {4, 19, 32, 22, 14};

        int[] result = selectionSort(arr);

        System.out.println(Arrays.toString(result));

    }
}
