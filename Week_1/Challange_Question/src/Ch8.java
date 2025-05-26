import java.util.Scanner;

public class Ch8 {
    // program to define the ticket price according to age

    public static void main(String[] args) {
        System.out.println("Welcome to ticket Counter");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

             if(age>60){
                 System.out.println("you are a senior citizen. You don't need to pay. ");
             }
             else if (age<12) {
                 System.out.println(("you are a child. You don't need to pay."));

             }
             else {
                 System.out.println("You are Adult. You have no Discount.");
             }
         }

    }

