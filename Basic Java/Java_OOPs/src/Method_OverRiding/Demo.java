package Method_OverRiding;


    class Calc{
        public int add( int a , int b){
//            System.out.println("show of A");
            return a+b;
        }
    }
    class AdvCalc extends Calc{
        public int add(int a , int b){
            return a+b+1;
        }
    }

public class Demo {

    public static void main(String[] args) {
        AdvCalc b = new AdvCalc();
        int a1 = b.add(2,4);
        System.out.println(a1);


    }

}
