package Operators;

public class LogicalOperators {

    public static void main(String[] args) {
        /*
         logical operators are  : && - AND , || - OR  ,! for not

         && - it should be true , both need to be a true, otherwise false
         || - if one condition is true it return true , if both false then false
         !  - if true then false , if false then true



        */

        // code example
        int num1 = 11;
        int num2 = 7;

        int a =7;
        int b= 19;

        boolean result =  a<b && num1>num2;
        System.out.println(result);


    }
}
