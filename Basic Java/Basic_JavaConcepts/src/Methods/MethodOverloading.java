package Methods;

class  Calculator{
    public  int add( int num1 , int num2 ){

        return  num1+num2;
    }

}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int r =calculator.add(3,5);
        System.out.println(r);

    }
}
