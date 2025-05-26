import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name : ");

        String name = input.nextLine(); // is used to get a string or a user input
        System.out.println("Good Morning " +name);
        System.out.println(name + " also tell me your age ");
        int age = input.nextInt(); // use to get integer form the user
        System.out.println( name +" your age is "+age);

    }
}
