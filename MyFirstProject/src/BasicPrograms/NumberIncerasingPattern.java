package BasicPrograms;

public class NumberIncerasingPattern {

    public static void IncreasingNumbers(int s){
        int i,j;
        for(i=1; i<=s; i++){

            for(j=1; j<=i; j++){
                 System.out.print(j + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n=4;

        IncreasingNumbers(n);
    }
}
