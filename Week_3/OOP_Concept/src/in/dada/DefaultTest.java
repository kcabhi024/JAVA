package in.dada;

import in.abhi.Car;

public class DefaultTest {
    public static void main(String[] args) {
        Car car = new Car("blue ", "bmw",12300,34);
        System.out.println(car);


        // due to default costOfCar method is not called here in the new packages

    }
}
