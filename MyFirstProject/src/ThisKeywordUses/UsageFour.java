package ThisKeywordUses;

public class UsageFour {

    void method1(UsageFour ref_variable){ //but the important point here is the method should have parameter with type CLASS NAME
        System.out.println("Hello the controller is here-----");
    }

    void method2(){
        method1(this); //this is also used to be passed as argument in a method call
    }

    public static void main(String[] args) {
        UsageFour obj = new UsageFour();

        obj.method2();

    }
}
