import java.util.Scanner;

public class Ch13 {
    public static void main(String[] args) {
        // to print the absolute number

        System.out.println("welcome to the abhi dada coding ");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =input.nextInt();

        int result = num>=0 ? num : -num;
        System.out.println("Absolute value is " +result);

    }
}
