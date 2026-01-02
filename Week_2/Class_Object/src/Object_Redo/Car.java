package Object_Redo;

public class Car {

    int numberOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;

    int getNumberOfSeats;



    public void Drive(){
        System.out.println("car is driving ");
        currentFuel --;
    }

    public void addFuel(float fuel){
        currentFuel +=fuel;
    }
    public float currentFuelLevel(){
        return currentFuel;
    }

    public static void main(String[] args) {
        Car car = new Car();

    }

}
