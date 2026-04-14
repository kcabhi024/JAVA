package Static;
class Mobile{
    String Brand;
    int Price;
    static String Model;
     public void Show(){

         System.out.println(Brand + " ,"  + Price + " ," + Model );
     }

}
public class Demo {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.Brand = " Apple";
        m1.Price = 1244;

        Mobile m2 = new Mobile();
        m2.Brand = "Samsung";
        m2.Price =1333;

        // yaha static lai class bata call    garda.. yeslae both object ko lagi apply garxa or
        // class ma vako sabai object ko lagi share garxa

        Mobile.Model ="6g";

        m1.Show();
        m2.Show();
}

}
