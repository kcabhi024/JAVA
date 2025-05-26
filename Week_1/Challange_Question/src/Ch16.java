import java.util.Scanner;

public class Ch16 {
    public static void main(String[] args) {
        // program to print sum of all odd number from 1 to N
        System.out.println("Welcome to the coding");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int N = input.nextInt();
        int sum =oddSum(N);
        System.out.println("Odd sum "+ N+ " = " +sum);

    }
    public  static int oddSum(int N){
        int i =1;
        int sum =0;
        while (i<= N){
            sum = sum+i;
            i =i+2;
        }

        return sum;
    }
}
