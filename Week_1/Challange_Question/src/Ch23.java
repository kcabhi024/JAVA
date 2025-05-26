import java.util.Scanner;

public class Ch23 {
    // program to print the armstrong number or not
    public static void main(String[] args) {
        System.out.println(" Program to find the Armstrong Number");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("The Number is Armstrong. ");
        }
        else {
            System.out.println("It is not a Armstrong Number. ");
        }


    }
    public  static boolean isArmstrong(int num){
        int digit = Count(num);
        int numcopy = num;
        int finalNum =0;
        while (num>0){
            int lastdigit = num%10;
            num/=10;
            finalNum = finalNum + power(lastdigit,digit);

        }
        //System.out.println("final number = " +finalNum);
        return finalNum == numcopy;
    }
    public  static int power(int num1,int num2){
        int reuslt =1;

        int i=0;
        while (i<num2){
            reuslt =reuslt*num1;
            i++;
        }
        //System.out.println("power = " +reuslt);
        return reuslt;
    }
    public  static  int Count(int num){
        int digit =0;
        while (num>0){
            digit++;
            num/=10;
        }
        //System.out.println("number of Digits = "+digit);
        return digit;
    }
}
