import java.util.Scanner;
class OccurrenceNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Occurrence of the number ");

        int [] num =ArrayUtility.inputarray();
        System.out.println("Enter a number you want to search: ");
        int element = input.nextInt();

        int count =occurrenceNum(num ,element);
        System.out.println("The number was found "+ count + " times");



    }

    public  static  int  occurrenceNum(int [] num ,int element){
        int count =0;
        for (int nums: num)
        {
            if (nums==element){
                count++;
            }
        }
        return count;
    }
}
