public class Ch14 {
    public static void main(String[] args) {
        printPattern();
        System.out.println(); //to get a space between;
    }
    public  static  void printPattern(){
        int rows=0;
        while (rows<5){
            System.out.print("*");
            int i =0;
            while (i<rows){
                System.out.print(" *");
                i ++;
            }
            System.out.println();
            rows++;
        }
    }

}
