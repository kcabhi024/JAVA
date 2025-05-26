import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
    int num1 =readNum();
    int num2 =readNum();

            int sum =num1 + num2;
        System.out.println("Sum = "+sum);


    }
    public  static int readNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num =input.nextInt();
        return num;
    }

}
