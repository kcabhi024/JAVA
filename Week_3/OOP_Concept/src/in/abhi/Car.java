package in.abhi;

public class Car {
    public  String color;

    public String modelNo;

    double priceOfCar;
    private double fuelLevel;

    public  Car(){

    }

    public Car(String color, String modelNo, double priceOfCar, double fuelLevel) {
        this.color = color;
        this.modelNo = modelNo;
        this.priceOfCar = priceOfCar;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", priceOfCar=" + priceOfCar +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
