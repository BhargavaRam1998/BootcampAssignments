package ThisKeywordUses;


public class UsageOne {

    String s;
    int n;

    UsageOne(int n, String s){
        this. s = s;   //this keyword is used to refer current class instance variable
        this.n = n;
    }

    public static void main(String[] args) {
        UsageOne obj = new UsageOne(45, "Ram");
    }
}
