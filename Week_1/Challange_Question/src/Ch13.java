import java.util.Scanner;

public class Ch13 {
    public static void main(String[] args) {
        // calculate the grades according to the marks

        System.out.println("welcome to the grade calculator");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int marks = input.nextInt();

        if(marks >100 ){
            System.out.println("Enter a valid Marks");
        } else if (marks>=90 && marks<99) {
            System.out.println("you have got A");
        }
        else if (marks>=75 && marks<90) {
            System.out.println("you have got B");
        }
        else if (marks>=60 && marks<75) {
            System.out.println("you have got C");
        }
        else if (marks>=30 && marks<60) {
            System.out.println("You have got D");
        }
        else if (marks>0 && marks<30) {
            System.out.println("you have failed ! ");
        }
        else if(marks<0){
            System.out.println("Invalid marks");
        }



    }
}
