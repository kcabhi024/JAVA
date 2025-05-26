import java.util.Scanner;

public class Ch2 {
    public static void main(String[] args) {
        // occurrence of the array
        System.out.println("welcome to coding ");

        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputarray();

        System.out.println("Enter s number : ");
        int num = input.nextInt();

        int occ = noOfOccurrence(numArr,num);
        System.out.println("The number of Occurrence is "+occ + " in the array");



    }
    public  static  int noOfOccurrence (int[] numArr, int num){
        int occ = 0;
        int i =0;
        while (i<numArr.length){
           if(numArr[i] == num){
               occ++;
           }
            i++;

        }

            return occ;
    }
}
