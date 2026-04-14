package Static;


class  Computer{
    String brand;
    int price;
    static String Model ;

//    public  void  show(){
//        System.out.println( brand + "," + price + " ," + Model);
//    }

    // here... maile static method use  garya xu, kina vane static method lae
    // static method lai call garna ko lagi direct class name bata hunxa..
    // static method ma object call garna xa vane mathi nai parameter ma class ko object banayara
    // ani obj name . gardai call garna parxa


    static  void Print(Computer obj){
        System.out.println( obj.brand + "," + obj.price + " ," + Model);
        System.out.println(" In static Method ");
    }

}

public class StaticMethodExample {

    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.price = 1200;
        computer1.brand =" Dell ";

        Computer computer2 = new Computer();
        computer2.price = 1250;
        computer2.brand =" Mac Book ";

        // static variable ho,  yeslai direct class name bata call garna melxa
        Computer.Model = "5g";
//        computer1.show();
//        computer2.show();

        // yo static method lai class name bata call garya  with the parameter computer
        // ani static method sanga common functionality hunxa

        Computer.Print(computer1);



    }
}
