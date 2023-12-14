package ThisKeywordUses;

public class UsageThree {

    UsageThree(){
        System.out.print("The amount is: ");
    }

    UsageThree(int x){
        this(); //this can be used to invoke(call) current class constructor. as there is no arguments here in the this, it calls the above default constructor
        System.out.println(x);
    }

    public static void main(String[] args) {

        UsageThree obj = new UsageThree(10);
    }
}
