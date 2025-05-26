import java.util.Scanner;

public class Ch18 {
    public static void main(String[] args) {
        System.out.println(" welcome to  the LCM");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter a Number : ");
        int num2 = input.nextInt();
        int lcm = lcm(num1,num2);
        System.out.println("The lcm = " +lcm);


    }
    public static int lcm(int num1, int num2){
    int i=1;
    while (i<=num2){
        int factor = i* num1;
        if(factor%num2 == 0){
            return factor;
        }
        i++;
    }
        return 0; // unreachable
    }
}
