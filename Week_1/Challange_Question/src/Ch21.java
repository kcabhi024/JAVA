import java.util.Scanner;

public class Ch21 {
    // program to reverse a number
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Number ! ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int reverse = reverseNum(num);
        System.out.println("The reverse num is " + reverse);


    }
    public static int reverseNum(int num){
        int newnum= 0;
        while (num>0){
            int digit =num%10;
            newnum = newnum*10 +digit;
            num =num/10;
        }
        return newnum;
    }

}
