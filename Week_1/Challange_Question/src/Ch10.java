import java.util.Scanner;
import java.util.SortedMap;

public class Ch10 {
    public static void main(String[] args) {
        // to check the number is odd or even
        System.out.println("welcome to number check");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("The given Number "+num+" is Even.");
        }
        else {
            System.out.println(("The given Number "+num+ " is Odd."));
        }
    }
}
