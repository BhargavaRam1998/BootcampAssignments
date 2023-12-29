package Abstract;

public class Sonn extends Son{


    @Override
    void Partner(String name, int age){
        System.out.println("I would like to marry " + name + " her age is " + age);
    }


    @Override
    void Career(String name){
        System.out.println("I wanted to become a " + name);
    }

}
