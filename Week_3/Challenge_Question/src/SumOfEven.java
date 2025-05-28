 class SumOfEven {

     // sum of even number using a continue statement
     public static void main(String[] args) {

         int[] arr = ArrayUtility.inputarray();

         int sum= 0;

         for(int num : arr){
             if(num%2 ==0){
                 continue;
             }
             sum += num;
         }
         System.out.println("The sum is : " +sum);
     }
}
