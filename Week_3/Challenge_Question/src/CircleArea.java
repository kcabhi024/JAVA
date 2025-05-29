import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Radius : ");
        int r = input.nextInt();

        double area = Math.round(Math.PI*r);
        System.out.println("Area is " + area);

        double cir = Math.round(2*Math.PI*r);

        System.out.println("Circumference is " + cir);
    }
}
