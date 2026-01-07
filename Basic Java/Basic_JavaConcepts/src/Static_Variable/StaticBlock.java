package Static_Variable;

class Phone{

    String brand;
    static String name;
    int price;

    static {
        name ="phone";
        System.out.println("called Static block");
    }

    public  Phone(){
        brand= "";
        price= 2000;
        System.out.println("In constructor");
    }


    public  void Show(){
        System.out.println(brand  + " : " + name + " : "  + price);
    }

}


public class StaticBlock {

    public static void main(String[] args) {


        Phone p1 = new Phone();



        Phone p2 = new Phone();
    }

}
