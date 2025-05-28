import java.util.Scanner;

class PasswordChecker {

    // program to find the password using a do while lop

    public static void main(String[] args) {
        System.out.println(" password checker ");

        Scanner input = new Scanner(System.in);
        String pass;

        boolean isValid;
        do{
            System.out.println("Enter your Password : ");
             pass = input.next();
        }
        while (!isValidPass(pass));{
            System.out.println("thank you for entering a valid password ");
        }

    }
    public static boolean isValidPass(String password){

        return password.length()>6;
    }

}
