import java.util.Scanner;

public class Ch6 {
    public static void main(String[] args) {
        // program to calculate the simple interest and the compound interest getting p,t,r form the user

        System.out.println("Welcome to coding");
        Scanner input = new Scanner(System.in);
        System.out.println("Principle: ");
        double p = input.nextDouble();
        System.out.println("Time: ");
        double t = input.nextDouble();
        System.out.println("Rate :");
        double r =input.nextDouble();

        double SI = (p*t*r)/100; // simple interest formula
        double CI =p*Math.pow(1+r/100,t); // compound interest formula

        System.out.println("The Simple interest is: " + SI);
        System.out.println("The Compound Interest is: " + CI);




    }
}
