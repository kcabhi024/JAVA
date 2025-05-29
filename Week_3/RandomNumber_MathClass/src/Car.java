public class Car {
    // toString method

    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String company;
    String modalNumber;

    @Override
    public String toString() {
        return "my car max speed is " + maxSpeed;
    }

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String company, String modalNumber){
    this.noOfWheels =noOfWheels;
    this.noOfDoors =noOfDoors;
    this.maxSpeed= maxSpeed;
    this.name =name;
    this.company =company;
    this.modalNumber =modalNumber;
}
    public static void main(String[] args) {
        Car swift = new Car(4,4,120,
                "Swift","sw9090","abhi");
        System.out.println(swift.toString());
    }
}
