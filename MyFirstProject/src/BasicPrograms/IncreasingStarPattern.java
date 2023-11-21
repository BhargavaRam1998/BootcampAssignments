package BasicPrograms;

public class IncreasingStarPattern {

    public static void pattern1(int s){
        int i,j;

        for(i=1; i<= s; i++){

            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }
}
