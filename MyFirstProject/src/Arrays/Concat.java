package Arrays;

import java.util.Arrays;

public class Concat {


    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int[] combined_array = new int[nums.length * 2];

        for(int i=0; i<n; i++){
            combined_array[i] = nums[i];
            combined_array[n + i] = nums[i];
        }

        return combined_array;

    }
    public static void main(String[] args) {

        int[] arr = {1, 3, 5,};

        int[] result = getConcatenation(arr);

        System.out.println(Arrays.toString(result));

    }
}
