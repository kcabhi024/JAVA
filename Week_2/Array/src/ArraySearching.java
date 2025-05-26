import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("array searching");
        Scanner input = new Scanner(System.in);
        int[] arr = {4,7,88,9,67,65,45,43,64,89,90,96,78,32};
        System.out.println("Enter a Number : ");
        int num = input.nextInt();

        boolean isFound = isFound(arr ,num);
        if(isFound){
            System.out.println("Matched !");
        }
        else {
            System.out.println("Not Matched !");
        }

    }
    public  static  boolean isFound(int[]arr ,int num){
        int index = 0;
        while (index <arr.length){
            if (num == arr[index]){
                return true;
            }
            index++;
        }

        return false;
    }
}
