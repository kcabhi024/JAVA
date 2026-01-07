package Static_Variable;

class  Mobile1 {

    String brand;
    int price;

    // static means common for all object and it should be called with the class name
    // static keyword belongs to a class
    static  String name;

    public  void  show(){
        System.out.println( brand + ": "  + name + " : " + price + ": ");
    }

}
public class StaticVariable {

    public static void main(String[] args) {
        Mobile1 mobile = new Mobile1();
        mobile.brand = "Apple" ;
        mobile.price = 1200;
        Mobile.name = "Smart Phone";

        Mobile1 mobile1 = new Mobile1();
        mobile1.brand = "Samsung" ;
        mobile1.price = 1100;
        Mobile.name = "Phone";


        mobile.show();
        mobile1.show();


    }


}
