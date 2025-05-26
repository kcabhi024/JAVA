import java.util.Scanner;

public class ShortHandOperator {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        a= a+x1;
        System.out.println(a);
        int x2= input.nextInt();
        a= a+x2;
        System.out.println(a);
    }
}
