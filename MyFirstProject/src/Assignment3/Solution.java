package Assignment3;

//Subtract the Product and Sum of Digits of an Integer
public class Solution {

    public int subtractProductAndSum(int n) {

        int s =0;
        int p =1;

        while (n > 0){
            int rem = n % 10;
            s = s + rem;
            p = p * rem;
            n /= 10;
        }

        int result = p - s;

        return result;

    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int final_result = obj.subtractProductAndSum(546);

        System.out.println("The final result is: " + final_result);

    }
}
