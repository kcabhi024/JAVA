import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        // to solve tha factorial using recursion

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        long fact =factorial(num);
        System.out.println("Factorial is " +fact);

    }
//
//    public  static long factorial(int num){
//        long result =1;
//        for (int i=1; i<= num; i++)
//        {
//            result =i*result;
//        }
//
//        return result;
//    }

    public static long factorial(int num){
        System.out.println("function called");
        if(num==1){
            return 1;
        }
        return num* factorial(num-1);
    }
}
