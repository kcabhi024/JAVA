public class BreakAndContinue {

    // break statement
    public static void main(String[] args) {
//        System.out.println("in loop");
//        for(int i=1 ; i<=100; i++){
//            if(i==90){
//               break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("out of loop");
//  }

        // continue
        System.out.println("in loop");
        for(int i=1 ; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }


}
