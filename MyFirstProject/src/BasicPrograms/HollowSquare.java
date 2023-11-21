package BasicPrograms;

public class HollowSquare {

    public static void Square(int s){
        int i,j;
        for(i=0; i<s; i++)
        {
            for(j=0; j<s; j++)
            {
                if(i==0 || i==s-1 || j==0 || j == s-1)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        Square(n);
    }
}
