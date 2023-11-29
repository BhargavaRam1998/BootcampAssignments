package Arrays;

/*
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

 */
public class Identical {

    public static int numIdenticalPairs(int[] nums) {
        int n = 0;
        for(int i=0; i<nums.length; i++){

            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j] && i<j){
                    n++;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 3};

        int result = numIdenticalPairs(arr);

        System.out.println(result);

    }
}
