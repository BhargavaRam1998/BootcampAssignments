package ThisKeywordUses;

public class UsageFive {

    int n = 100;
    UsageFive(){

        //Test ob = new Test(this); //this can be used to be passed as argument in the constructor call
        method1();
    }

    void method1() {
        Test ob1 = new Test(this); //when we send this as parameter in constructor call to basically send the instance of this class
    }

    void display(){
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        UsageFive object = new UsageFive();
    }


}

class Test{

    UsageFive obj;
    Test(UsageFive obj){ //as we see here obj is an instance of class UsageFive
        this.obj = obj;
        obj.display(); //we are able to call the instance method display of class UsageFive using its object
        display();
    }

    void display(){
        System.out.println("The number is: " + obj.n); //we accessed the instance variable with the help of object here
    }
}


