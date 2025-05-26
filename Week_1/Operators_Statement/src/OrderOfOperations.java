public class OrderOfOperations {
    public static void main(String[] args) {
        // it uses the same operation in form of BDMAS rule

        System.out.println(6-2*3);

        System.out.println(9/3/3);  // if there is same operator executes from left to right
        System.out.println(9/(3/3+2)); // if there is a bracket it executes the bracket first
    }
}
