public class TwoDarray {
    public static void main(String[] args) {
    // 2d array row and column , here also multiple dimensional
         int [][] arr = new int[2][3];
         arr[0][0] =1;
        arr[1][0] =2;
        arr[0][1] =3;
        arr[1][1] =1;

        System.out.println(arr[1][0]);

        int [][] array= {{1,2,3},{4,5,6,},{7,8,9}};
        System.out.println(array[1][1]);
        System.out.println(array[1].length);

        int i =0;
        while (i<array.length){
            int j =0;
            while (j<array[i].length){
                System.out.print(array[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }




    }
}
