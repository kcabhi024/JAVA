package Static;


class Computer1 {

    String model;
    String Gen;
    int Price;
    static String os;


    public void show(){

        System.out.println(model + "  :  " + Gen + "  :  " + Price +"  :  " + os);
    }

    static  void  show1(Computer1 comp){
        System.out.println(" From static method  \n" + comp.model + " : " + comp.Gen+
        "  :  " + comp.Price + "  :  " + os );

    }
    static {
        System.out.println(" in a static block");
    }

}
public class StaticExample {
    public static void main(String[] args) {

        Computer1 computer1 = new Computer1();
        computer1.model ="i5 7th";
        computer1.Gen ="7th gen";
        computer1.Price = 1300;

        Computer1 computer2 = new Computer1();
        computer2.model ="i5 11th";
        computer2.Gen ="11th gen";
        computer2.Price = 1250;

        Computer1 computer3 = new Computer1();
        computer3.model ="i7 12th";
        computer3.Gen ="12th gen";
        computer3.Price = 1550;


        Computer1.os =" windows";

        computer1.show();
        computer2.show();

        Computer1.show1(computer3);
    }

}
