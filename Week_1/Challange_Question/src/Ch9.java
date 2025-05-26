import java.util.Scanner;

public class Ch9 {
    public static void main(String[] args) {
        // to determine the number is neg, pos, or zero

        System.out.println("welcome to the number check coding");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();

        if(num>0){
            System.out.println("The number "+num+ " is Positive.");
        } else if (num==0){
            System.out.println("The number is Zero.");
        }
        else {
            System.out.println("The number "+num+" is Negative.");
        }
    }
}
