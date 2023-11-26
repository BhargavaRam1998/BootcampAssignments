package Arrays;

import java.util.Arrays;

public class buildArray {

    public static int[] buildArray(int[] nums) {

        int[] result = new int[nums.length];

        for(int i=0; i<result.length; i++){
            int x = nums[i];
            result[i] = nums[x];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {0,2,1,5,3,4};

        int[] ouput = buildArray(nums);

        System.out.println(Arrays.toString(ouput));


    }
}
