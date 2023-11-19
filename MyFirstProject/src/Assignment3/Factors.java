package Assignment3;

//Input a number and print all the factors of that number (use loops).
public class Factors {

    public void factor(int n){

        int s;

        for (int i = 1; i <= n; i++) {

            s = n % i;

            if (s == 0){
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {

        Factors object = new Factors();

        object.factor(786);

    }
}
