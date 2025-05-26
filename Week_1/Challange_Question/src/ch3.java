import java.sql.SQLOutput;
import java.util.Scanner;

public class ch3 {
    public static void main(String[] args) {
        // create a program to take a 2 number form the user and perform all arithmetic operator

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x1 =input.nextInt();
        System.out.println("Enter second number: ");
        int x2 = input.nextInt();

        //operators
        int add = x1+x2;
        int sub =x1-x2;
        int mul = x1*x2;
        float div =x2/x1;
        int  mod = x1%x2;

        System.out.println("Addition = "+ add);
        System.out.println("Subtraction = " +sub);
        System.out.println("Multiply = " + mul);
        System.out.println("Divison = " + div);
        System.out.println("Modulus = " + mod);

    }
}
