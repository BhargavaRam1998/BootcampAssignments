package Algorithms;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            
           int mid = start + (end - start) / 2;
           
           if (target > arr[mid]){
               start = mid + 1;
           } else if (target < arr[mid]) {
               end = mid - 1;
           } else if ( target == arr[mid] ){
               return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {-18, -12, -4, 0, 7, 10, 15, 29};

        int value = -12;

        int result =  binarySearch(arr, value);

        System.out.print(result);

    }

}
