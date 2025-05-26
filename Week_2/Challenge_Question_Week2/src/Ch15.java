import java.util.Scanner;

public class Ch15 {
    public static void main(String[] args) {
        // program to find the month name

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number : ");
        int month = input.nextInt();

        String monthName = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        System.out.println(monthName);
    }
}
