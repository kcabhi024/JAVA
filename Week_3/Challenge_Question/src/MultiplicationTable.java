import java.util.Scanner;

public class MultiplicationTable {
    // multiplication table using for loop
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        for (int i = 1; i<=10 ;i++){
            int result = num*i ;
            System.out.println(num + " * "+ i +" = " + result );
        }
    }
}
