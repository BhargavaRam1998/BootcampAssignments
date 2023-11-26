package Arrays;

import java.util.Arrays;

public class TwodimensionalArrays {

    public static void main(String[] args) {


        int[][] array = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };


//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int[] s: array){
            System.out.println(Arrays.toString(s));
        }
// both of the above approaches are correct, bottom one is the enhanced one. This program is to just understand the concept of 2D arrays.


    }
}
