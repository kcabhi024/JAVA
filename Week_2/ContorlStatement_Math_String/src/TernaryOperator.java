import java.sql.SQLOutput;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number :");
        int num1 = input.nextInt();
        System.out.print("Enter a second number :");
        int num2 =input.nextInt();


//        int greaterNumber;
//
//        if(num1 >num2){
//            greaterNumber =num1;
//        }
//        else {
//            greaterNumber =num2;
//        }


        // here minimizes code using a ternary operator
        int greaterNumber = (num1 > num2) ? num1 : num2;
        System.out.println(greaterNumber + " is greatest number");
    }
}
