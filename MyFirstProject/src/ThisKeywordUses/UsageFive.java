package ThisKeywordUses;

public class UsageFive {

    int n = 100;
    UsageFive(){

        Test ob = new Test(this); //this can be used to be passed as argument in the constructor call
    }

    public static void main(String[] args) {
        UsageFive object = new UsageFive();
    }


}

class Test{

    UsageFive obj;
    Test(UsageFive obj){
        this.obj = obj;
        display();
    }

    void display(){
        System.out.println("The number is: " + obj.n);
    }
}


