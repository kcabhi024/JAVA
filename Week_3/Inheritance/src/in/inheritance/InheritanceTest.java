package in.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle();
        TwoWheelers two = new TwoWheelers();
        vehicle.commute();
//        System.out.println(vehicle.toString());
//        System.out.println(vehicle.hashCode());
//        System.out.println(vehicle.getClass());
//        System.out.println();
        two.commute();
        two.balance();
        Motorcycle moto =new Motorcycle();
        moto.commute();
        moto.balance();
        moto.start();
    }
}
