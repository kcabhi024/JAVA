import java.util.Scanner;

public class Ch24 {
    // Palindrome Number

    public static void main(String[] args) {
        System.out.println(" Palindrome or Not");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("The number is Palindrome .");
        }
        else {
            System.out.println("The Number is not Palindrome Numebr");
        }

    }
    public  static boolean isPalindrome(int num){
        int num2 =ReverseNum(num);
       while (num == num2){
           return true;
       }
        return false;
    }
    public  static int ReverseNum(int num){
        int newNum =0;
        while (num>0){
            int digit = num%10;
            newNum = newNum*10 +digit;
            num =num/10;
        }

        return newNum;
    }
}
