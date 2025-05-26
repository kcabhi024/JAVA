public class Car {
    // here is a class properties and a methods
    int noOfWheels;
    String color;
    float currentFuels;
    int noOFSeats;

    Car(String color){      // this is constructor
        this.color =color;
        noOFSeats =5;
        noOfWheels =4;
    }
    public  Car Start(){

        if (currentFuels == 0)
        {
            System.out.println("No fuel in car, Cannot start");
        } else if (currentFuels <5) {
            System.out.println("car is in reserve");
        }
        else
        {
            System.out.println("Started");
        }
        return this;
    }
    public  void drive(){
            currentFuels--;
            System.out.println("driving");
    }
    public  void addFuel(float currentFuels){
        this.currentFuels +=  currentFuels; // using this to call the instance class variable of class
// also this is used to resolve  the same name of the methods and the variables
    }
    public  float getCurrentFuelStatus(){
        return currentFuels--;
    }


    @Override
    protected void finalize() throws Throwable{
        // it provide us one more chane to clean up resourcea
        System.out.println("in finalize");
    }
}
