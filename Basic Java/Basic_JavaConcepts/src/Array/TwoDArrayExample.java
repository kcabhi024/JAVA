package Array;

public class TwoDArrayExample {

    /*
    Array of Array

     */
    public static void main(String[] args) {

// using math random
        int num[] [] = new int[3][4];
        int rand = 0;

        for(int i =0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                num[i][j] =(int)(Math.random()*10);
//                System.out.print(num[i][j]);
            }

        }

        for(int i =0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printed by enhanced loop");
        // enhanced for loop
        for (int n[] : num){
            for (int m :n){
                System.out.print(m  + " ");
            }
            System.out.println();
        }
    }
}
