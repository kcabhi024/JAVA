import java.util.Scanner;

public class ch2 {
    public static void main(String[] args) {

        //q. program to swap a two number using assignment operator
        System.out.println("welcome to swapping a number");
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of A:");
        int a =input.nextInt();
        System.out.println("enter a value of B");
        int b = input.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.println("swapping Done");
        System.out.println("the value of A is :" +a);
        System.out.println("value of B is: " +b);

    }
}
