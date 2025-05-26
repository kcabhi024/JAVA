public class Driver {

    static  int minAge = 18;
    String name;
    int age;
    String dateOfIssue;

    public boolean iAllowed(){
        return this.age >= minAge;
    }


    public static void main(String[] args) {
//        Car myCar =new Car();
//        myCar.addFuel(7);
//        myCar.drive();//calling object
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelStatus()); // calling object in print
        
        Car bmw =new Car("red");
        bmw.addFuel(6);
//        bmw.Start();
        /* using static keyword **/
//        bmw.drive();
        // using this key word , we can also do like this;
        Car started = bmw.Start();
        started.drive();
        System.out.println(bmw.color); // calling constructor
/*
       Driver myDriver = new Driver();
       myDriver.dateOfIssue="1 jan 2001"; //
        System.out.println(minAge); // can be used directly
        **/

    }

    // can be called nonstatic field in the static class
}
