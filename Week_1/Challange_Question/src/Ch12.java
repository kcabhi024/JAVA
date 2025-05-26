import java.util.Scanner;

public class Ch12 {
    public static void main(String[] args) {
        //to determine the given number is a leap year or not

        System.out.println("welcome to Coding");
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a Year : ");
        int year = input.nextInt();

        if(year%400 ==0 ){
            System.out.println("The year is Leap Year.");
        }
        // if(year % 400 =0 || (year % 4==0 && year % 100 !=0)) // using logical operator
        else if(year % 4==0 && year % 100 !=0) {
            System.out.println("The Year is Leap Year.");
        }
        else {
            System.out.println("The year is not a leap year.");
        }
    }
}
