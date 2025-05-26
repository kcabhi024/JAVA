public class Ch3 {
    public static void main(String[] args) {
        System.out.println(" Print the maximum in the Array ");
        int[] numArr = ArrayUtility.inputarray();

        int max = Maximum(numArr);
        System.out.println("The maximum is " + max);
        int min =Min(numArr);
        System.out.println("The minimum num is " + min);


    }
    public  static int Maximum(int[] numArr){
        int i =0;
        int max =0;
        while (i<numArr.length){
            if(max <numArr[i]){
                 max= numArr[i];
            }
            i++;
        }
        return max;
    }
    public static  int Min(int[] numArr){
        int i =0;
        int min =numArr[0];
        while (i<numArr.length){
            if(min>numArr[i]){
                 min =numArr[i];
            }
            i++;
        }
//        System.out.println(min);
        return min;
    }
}
