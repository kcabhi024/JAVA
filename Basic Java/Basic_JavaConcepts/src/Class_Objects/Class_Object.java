package Class_Objects;

public class Class_Object {

    /*
     oop - object Oriented
     object - it means the behaviour,
     to create an object we need to make a class
     Class - acts as a blue print


    */
    public static class  Calculator{

        int a ;

        public  int addNum(int n2, int n1){
            int r = n1  +n2;
            return r;
        }
    }


    public static void main(String[] args) {

        int num1 =5;
        int num2 =5 ;
        Calculator calculator = new Calculator();
        int result = calculator.addNum(num2,num1);
        System.out.println(result);

    }

}
