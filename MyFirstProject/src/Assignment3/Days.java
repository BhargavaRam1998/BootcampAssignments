package Assignment3;

//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

public class Days {

   public int Count(int n){

       int s =0;
       for (int i = 1; i <=n; i++) {

           if (i % 2 == 0){
               s++;
           }

       }
       return s;
    }

    public static void main(String[] args) {

        Days obj = new Days();

        int result = obj.Count(31);

        System.out.println("Kunal is allowed to play for following number of days: " + result);

    }
}
