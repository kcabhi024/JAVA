import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to relational Operator");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Age : ");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You are eligible for Driving ");
        }
        else {
            System.out.println("You are not eligible for Driving");
        }
    }
}
