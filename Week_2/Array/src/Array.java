public class Array {
    public static void main(String[] args) {
        // here i have a simple code about an array
        System.out.println("Array");



//        int[] myArray = new int[5];
//        myArray[0] = 20;
//        myArray[1]=40;
//        myArray[2]=43;
//        myArray[3]=45;
//        myArray[4] =44;
//        System.out.println(myArray[2]);
       int[] arr = {3,4,5,6,7}; //we can declare like this also
//        System.out.println(arr[3]);
        int index =0;
        //while (index<3){   // using loop to print the array item

        while (index<arr.length){
            System.out.println(arr[index]);
            index++;
        }


    }

}
