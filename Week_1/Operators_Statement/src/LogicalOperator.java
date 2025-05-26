import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("ticket discount counter");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your age: ");
        int age = input.nextInt();
        System.out.println("Are you a Female ?(true/false)");
        boolean isFemale = input.nextBoolean();

        if (isFemale && age>18 && age<60){
            System.out.println("female");
        }
        else if(age>=60){
            System.out.println("Senior Citizen");
        }
        else if(age>=6 && age<=18){
                System.out.println("School Student");}
        else if (age<6) {
                System.out.println("Children");
            }
        else {
                System.out.println("Adult");
            }
        }
    }


