package ThisKeywordUses;

public class UsageTwo {

    void display() {

        this.display1(); //this keyword is used to invoke(call) current class methods implicity and this works only with instance methods
        //display1(); even this works altough the method is instance and not static the compiler automatically assumes - this.display();
        System.out.println("How are you doing?");
    }

    void display1(){
        System.out.println("Hello!!!");
    }

    public static void main(String[] args) {
        UsageTwo obj = new UsageTwo();

        obj.display();
    }
}
