import java.util.Scanner;

public class Ch4 {
    public static void main(String[] args) {

        // num to delete for  the array
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputarray();
        System.out.println("Enter a number to Delete : ");
        int numDelete = input.nextInt();

        int[] newArray = deleteNum(numArr,numDelete);
        System.out.println("here is a new array");
        ArrayUtility.DisplayArray(newArray);
    }
    public  static  int[] deleteNum(int[] numArr, int numDelete){
        int occ = Ch2.noOfOccurrence(numArr, numDelete);
        if (occ==0){
            return  numArr;
        }
        int newSize = numArr.length -occ;
        int [] newArr = new  int[newSize];


        int i =0;
        int j =0;
        while (i<numArr.length){
            if (numArr[i] != numDelete){
             newArr[j] = numArr[i];
             j++;
            }
            i++;
        }
       return newArr;
    }
}
