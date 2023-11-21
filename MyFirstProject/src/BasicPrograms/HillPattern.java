package BasicPrograms;

public class HillPattern {

    public static void Hill(int s){
        int i,j;

        for(i=1; i<= s; i++){

            for(j=i; j<=s; j++){
                System.out.print("  ");
            }

            for(j=1; j<=i; j++){
                System.out.print("* ");
            }

            for(j=1; j<i; j++)
            {
                System.out.print(" *");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n=5;
        Hill(n);
    }
}
