package ThisKeywordUses;

public class UsageSix {

    public static void main(String[] args) {
      new Test1().H().dis();
    }
}
class Test1 {

    Test1 H(){
        return this;  //this can also be used to  return current class instance from the method
    }

    void dis(){
        System.out.println("Hello");
    }
}

