import java.util.Scanner;

public class Ch14 {
    public static void main(String[] args) {
        // program to print the student category according to their numebr


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();


        String result =num >= 80 ?" High" : num>=50? "Moderate" :"low";
        System.out.println("The evaluation is " + result);
    }
}
