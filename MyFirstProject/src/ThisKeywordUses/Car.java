package ThisKeywordUses;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car {

    int Wheels;
    String Make;

    String Model;

    public Car(int Wheels, String Make, String Model) {
        this.Wheels = Wheels;
        this.Make = Make;
        this.Model = Model;
    }

    public Car(Car car2){
        this.Wheels = car2.Wheels;
    }

    @Override
    public String toString() {
        return "Car [Wheels=" + Wheels + ", Make=" + Make + ", Model=" + Model + "]";
    }




    public static void main(String[] args) {

        Car car1 = new Car(2, "VW", "Sedan");

        Car car2 = new Car(car1);

        System.out.println(car1);

        System.out.println(car2);

        ArrayList list = new ArrayList();

        list.add("Hello");

        list.add(56);

        System.out.println(list);


    }
}
