import java.util.Scanner;

public class Ch15 {
    public static void main(String[] args) {
        // Program to perform multiplication

        System.out.println("Multiplication table");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =input.nextInt();
        int i=1;

        while (i<=10){
            int res = num *i;
            System.out.println(num +"*"+i+" = " +res);
            i++;
        }

    }
}
