import java.util.Scanner;

class MaximumInIntegerArray {
    public static void main(String[] args) {
        // to find the maximum from the array
        int [] arr = ArrayUtility.inputarray();

        int max = Integer.MIN_VALUE;

        for (int num: arr){
            if(max <num){
                max =num;
            }
        }
        System.out.println("The Maximum number is " + max);
    }
}
