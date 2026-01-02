package Operators;

public class ArithmeticOperator {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 =6;
        int num3 = 8;
        int num4 = 21;


        // operators example
        int add = num1+num2;
        int sub = num4-num1;
        int mul =num1*num3;
        float div = num3/num1;
        int mod= num4%num2;


        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // others way
//        num2 +=3;
        num2*=4;
        System.out.println(num2);
        // increment and decrement
        int a =6 ;
        a--;
        System.out.println(a);
        int b=11;
        b++;  // pre increment -  first fetch the value and increment
        int results = ++ b; // post increment -   first increment and then fetch the value
        System.out.println(results);




    }
}
