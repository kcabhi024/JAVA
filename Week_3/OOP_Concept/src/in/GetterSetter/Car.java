package in.GetterSetter;

public class Car {


    private String color; // public ma set garne
    private String model; // public ma set garne

    private  double fuelLevel;  // default ma set garnee
    private long costOfCar;


    public String getColor(){
        return  color;
    }
    public String getModel(){
        return  model;
    }
    void setColor(String color){
        this.color=color;
    }

     public Car(String color, String model, double fuelLevel, long costOfCar) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfCar = costOfCar;
    }
}
