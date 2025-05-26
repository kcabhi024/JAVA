import java.util.Scanner;

public class Ch20 {

    // prime number
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : " );
        int num = input.nextInt();
        boolean isPrime = Prime(num);
        if (isPrime){
            System.out.println("The "+num +" is Prime .");
        }
        else {
            System.out.println("The "+num+" is not Prime");
        }


    }
    public static  boolean Prime(int num){
        int i = 2;
        while (i<num){
            if(num%i == 0){
             return false;
            }
            i++;
        }
        return true;
    }
}
