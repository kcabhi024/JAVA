package Static_Variable;


class Mobile {

    static  String name;
    String brand ;
    int price  ;

    public  void Show(){
        System.out.println(brand  + " : " + name + " : "  + price);
    }

    public  static  void show1(Mobile m1){
        System.out.println(m1.brand  + " : " + name + " : "  + m1.price );
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.price =1300;
        m1.brand= "Samsung";

        Mobile m2 = new Mobile();
        m2.price =1200;
        m2.brand= "Apple";

        Mobile.name= "Phone " ;



        m2.Show();

        Mobile.show1(m1);
    }

}
