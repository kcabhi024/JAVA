import java.util.Scanner;

public class Ch19 {
    public static void main(String[] args) {
        // to get the greatest common factor form the given number

        System.out.println("gcd calc");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter a Number : ");
        int num2 = input.nextInt();
        int gcd = Gcd(num1,num2);
        System.out.println("The GCD is : " +gcd);



    }
    public static int Gcd(int num1, int num2){
        int gcd=1;
        int i=2;
        int least =least(num1,num2);
        while (i<=least){
            if (num1 % i ==0 && num2 % i ==0){
                gcd=i;
            }
              i++;
        }
        return gcd;
    }
    public  static int least(int num1, int num2){
        if(num1<num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
