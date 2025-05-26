import java.util.Scanner;

public class Ch12 {
    public static void main(String[] args) {
        // program to find the odd or even using the ternary operator

        System.out.println("welcome to the abhi dada coding ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =input.nextInt();


        String oddEven = num%2==0 ? "evven":"odd";
        System.out.println("The "+num +" is " +oddEven);
    }
}
