package Arrays;
/*
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */
import java.util.ArrayList;

import java.util.List;

public class Candies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int maxCandies = 0;

        for (int i: candies){
            maxCandies = Math.max(maxCandies, i);
        }

        for (int i: candies){
            result.add(i + extraCandies >= maxCandies);
        }

        return result;
    }
    public static void main(String[] args) {

        int[] arr = {3, 1 ,6, 4};

        System.out.println(kidsWithCandies(arr, 3));


    }
}
