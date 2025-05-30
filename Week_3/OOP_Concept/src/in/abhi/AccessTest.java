package in.abhi;

public class AccessTest {

    public static void main(String[] args) {
        Car car =new Car();

//        car.color ="blue";
//        car.modelNo ="BMW-11";
//        car.priceOfCar =12300;

        Car newCar = new Car("blue","bmw",1230090,23.4);
        System.out.println(newCar);

    }


}
