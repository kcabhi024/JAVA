import java.util.Scanner;

public class NumberGuesser {
    // guess the number  without using the random function
    public static void main(String[] args) {
        int guess =5;
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number : ");
             num = input.nextInt();
        }
        while (num !=guess);
        System.out.println("you have guess correctly");
    }
}
