import java.util.Scanner;
 class FibonacciUsingRecursion {
    public static void main(String[] args) {
        System.out.println("fibonacci using recursion");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =input.nextInt();
        for (int i =1 ; i<=num ;i++){
            System.out.print(fibonacci(i) + " " );
        }

    }
    public static int  fibonacci(int position){
        System.out.print(".");
        if(position == 1){
            return 0;
        }
        if(position ==2){
            return 1;
        }
        return fibonacci(position-1) +fibonacci(position-2);
    }
}
