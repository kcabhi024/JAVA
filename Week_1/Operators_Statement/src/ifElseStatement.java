public class ifElseStatement {
    public static void main(String[] args) {
        boolean isSenior = false;
        boolean isAdult = false;
        boolean isChild =true;

        if(isSenior){
            System.out.println("hi Senior");
        }
        else {
            if(isAdult){
                System.out.println("hi Adult");
            }
            else {
                System.out.println("hi Child"); // this is a child case
            }
        }
    }
}
