package in.inheritance;

public class Vehicle {

    protected   int noOfTyres;


    public  void setNoOfTyres(int noOfTyres){
        this.noOfTyres =noOfTyres;
    }

    @Override
    public String toString() {
        return "Vehicle no Of Tyres=" + noOfTyres ;
    }

    public  void commute(){
        System.out.printf("i am going for place A to place B using %d tires. \n", noOfTyres);
    }
}
