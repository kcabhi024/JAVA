import java.util.Scanner;

class SumOfPositive {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int sum = 0;
         int [] arr = ArrayUtility.inputarray() ;

         for(int num: arr){
             if(num<0){
                 continue;
             }
             sum +=num;
         }
         System.out.println("sum is " +sum);
     }
}
