package Array;

public class ArrayExample {

    // arrays holds multiple values

    public static void main(String[] args) {

/*
        int num[] = {1,2,3,4};
        num[1] =7; // change the value 2 to 7 by 1 index
        System.out.println(num[1]);

*/
        // to print all value

        int num[]= new int[5];
        num[0] =7;
        num[1] =8;
        num[2] =9;
        num[3] =4;
        num[4] =3;

        for (int i=0 ;i<5; i++){
            System.out.println(num[i]);
        }
    }

}
