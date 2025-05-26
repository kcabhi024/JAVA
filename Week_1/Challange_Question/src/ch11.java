import java.util.Scanner;

public class ch11 {
    public static void main(String[] args) {
        // to check which number is a greater among the 3 numbers

        System.out.println("welcome to coding");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 =input.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2 =input.nextInt();
        System.out.println("Enter 3rd Number : ");
        int num3 =input.nextInt();

        if (num1>num2){
            System.out.println("The "+num1+ " is Greater.");
        }
        else if (num2>num3) {
            System.out.println("The "+num2+ " is Greater.");
        }
        else {
            System.out.println("The "+num3+ " is Greater.");
        }
    }
}
