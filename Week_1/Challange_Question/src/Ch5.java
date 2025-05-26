import java.util.Scanner;

public class Ch5 {
    public static void main(String[] args) {
        // program to calculate the perimeter and the area of the rectangle ;
        System.out.println("Welcome to Challenge Questions !");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle : ");
        double a = input.nextDouble();
        System.out.println("Enter breadth of the rectangle: ");
        double b = input.nextDouble();

        double area = a*b;
        double perimeter = 2*(a+b);

        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of  rectangle: "+ perimeter);


    }
}
