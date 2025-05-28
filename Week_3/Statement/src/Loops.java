import java.util.Scanner;

public class Loops {
    // do while loop

    public static void main(String[] args) {
        System.out.println("Do While loop");

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a age: ");
//        int age = input.nextInt();

//        while(age<0 || age>100){
//            System.out.println("Enter a age: ");
//            age = input.nextInt();
//
//    }
        int age;
        do{
            System.out.println("Enter a age: ");
            age = input.nextInt();
        }
        while (age<0 ||age >100);
        {
            System.out.println("your age is "+age);
        }


    }

}
