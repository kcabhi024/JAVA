import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputarray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of element : ");
        int size =input.nextInt();
        int[] num = new int[size];


        int i =0;
        while (i<size){
            System.out.print("Please enter element no " + (i+1) + " : ");
            num[i] = input.nextInt();
            i++;

        }
        return num;

    }
    public  static void DisplayArray(int[] numArray){
        int i= 0;
        while (i<numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
