package Array;

public class JaggedArray {
     /*
     internal array element can have multiple values
     that types of array is called as a jagged array;
    */


    public static void main(String[] args) {

        int num[][] = new int[3][];

        num[0]= new int[3];
        num[1] = new int[4];
        num[2]=  new int[2];

        for(int i =0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                num[i][j] =(int)(Math.random()*10);
//                System.out.print(num[i][j]);
            }

        }
        for (int n[] : num){
            for (int m:n){
                System.out.print( m +" ");
            }
            System.out.println();
        }
        /*
         drawbacks of array :
         - it occupy the space in a heap
         - it size cannot be expanded if it fixed
         - it consume time for inserting , searching

        */


    }
}
