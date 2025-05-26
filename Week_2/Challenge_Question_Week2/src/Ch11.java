import java.util.Scanner;

public class Ch11 {
    //find the minimum among to number using ternary operator


    public static void main(String[] args) {
        System.out.println("welcome to the week 2 challenges");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1st number: ");
        int num1 =input.nextInt();
        System.out.print("Enter a 2nd number: ");
        int num2 =input.nextInt();


        int smallNumber = num1<num2 ? num1:num2 ;
        System.out.println(smallNumber + " have the minimum value");
    }
}
