package Arrays;

import java.util.ArrayList;

public class CreateTargetArray {

    public static int[] Result(int[] nums, int[] index) {

        ArrayList<Integer> final_result = new ArrayList<Integer>();

        int [] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            final_result.add(index[i], nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            result[i] = final_result.get(i);
        }

        return result;

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,0};

        int[] index = {0,1,2,3,0};

        System.out.println((CreateTargetArray.Result(nums, index)).toString());

    }
}
