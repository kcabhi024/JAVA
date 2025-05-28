import java.util.Scanner;

public class BreakingLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        while (true){

            System.out.println("Enter a command : ");
            String cmd = input.next();
            if (cmd.equals("exit")){
                break;
            }
        }
        System.out.println("you have done it Perfectly...");
    }

}
