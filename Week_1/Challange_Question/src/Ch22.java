import java.util.Scanner;
import java.util.SortedMap;

public class Ch22 {
    public static void main(String[] args) {
        // program to print the fibonacci series upto the given number
        System.out.println("Fibonacci Series upto the Given number ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = input.nextInt();
        System.out.println("The fibonacci series ");
        fibonacciSeries(num);


    }
    public  static void fibonacciSeries(int num){
        if (num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");

        int num1=0,num2=1;
        while (num1 + num2 <= num){
            int num3 =num1 + num2;
            System.out.print(num3 + " ");

            num1 = num2;
            num2 = num3;
        }
    }
}

