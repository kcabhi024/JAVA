import java.util.Scanner;

public class Ch17 {
    public static void main(String[] args) {
        // to print a fibonacci series

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int N = input.nextInt();
        Fibonacci(N);


    }
    public  static  void Fibonacci(int N){
        int num1= 1;
        int num2 =1;
       int i =0;

       while (i<N){
           System.out.println(num1 +" ");
           i++;

           int num3 =num2 +num1;
           num1 =num2;
           num2=num3;
       }
    }
}
