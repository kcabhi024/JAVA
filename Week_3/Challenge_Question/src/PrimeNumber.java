import java.util.Scanner;
import java.util.SortedMap;

class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("To print the number is a prime number of not using a for loop ");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        System.out.println("your num is "+ (isPrime(num)? "Prime " : "Not prime"));
    }
    public static boolean isPrime(int num){
        for (int i=2 ; i<num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
