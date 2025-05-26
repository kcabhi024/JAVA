import java.util.Scanner;

public class Ch1 {
    public static void main(String[] args) {
        // array sum
        System.out.println(" Array sum ");
         int[] numArray = ArrayUtility.inputarray();
         long sum =sum(numArray);
         int average = average(numArray);

        System.out.println("Sum of the num = : " +sum);
        System.out.println("Average = " +average);
    }

    public  static  long sum(int[] numArray){
        long sum = 0;
        int i =0;
        while (i <numArray.length){
            sum = sum + numArray[i];
            i++;
        }

        return  sum;
    }
    public static  int average(int[] numArray){
        long sum = sum(numArray);
        long avg = sum/numArray.length;
        return (int)(avg);
    }
}

