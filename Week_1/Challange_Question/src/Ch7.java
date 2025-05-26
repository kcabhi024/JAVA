import java.util.Scanner;

public class Ch7 {
    public static void main(String[] args) {
        // Program to convert the Fahrenheit into a Celsius formula c=(f-32)*5/9
        System.out.println("Welcome to Coding");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Fahrenheit: ");
        double f = input.nextDouble();

        double C = (f-32)*5.0f/9.0f; // formula

        System.out.println("The" +f+" Fahrenheit is "+C+" degree Celsius. ");
    }
}
