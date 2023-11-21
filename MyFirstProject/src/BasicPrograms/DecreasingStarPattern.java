package BasicPrograms;

public class DecreasingStarPattern {

    public static void pattern3(int s){
        int i,j;

        for(i = 1; i<=s; i++){
            for (j=i; j<=s; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern3(n);
    }
}
