import java.util.Scanner;

public class ch1 {
    // q. program to take a user input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name :");
        String name = input.nextLine();
        System.out.println("hi " + name + " good morning");

        System.out.println("enter a Number :");
        int a = input.nextInt();
        System.out.println("enter 2nd number :");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("the sum of " + a + " and " + b + " is " + sum);
    }
}
