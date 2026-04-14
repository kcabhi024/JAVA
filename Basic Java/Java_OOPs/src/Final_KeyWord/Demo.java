package Final_KeyWord;


class  Calc{

    public final void show(){
        System.out.println("in calc show");
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}


class AdvCalc extends Calc{
    public void ashow(){
        System.out.println("in adv calc"); // it override the above show method so final is used
    }
}
public class Demo {

    // final method


    public static void main(String[] args) {
//        final  int a =8;

        // final  vairable laya paxi chage garna meldaina

        Calc calc = new Calc();
        calc.add(2,4);
        calc.show();


    }
}
