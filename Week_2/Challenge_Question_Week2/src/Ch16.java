import java.util.Scanner;

public class Ch16 {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second Number : ");
        int num2 = input.nextInt();

        System.out.println("Enter in a Operation : ");
        System.out.println("hello world");
        String operation = input.next();

        int result = switch (operation) {
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default -> -1;
        };
        System.out.println("Your ans = " + result);

    }
}
