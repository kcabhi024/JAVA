public class Unary {
    public static void main(String[] args) {
        int x=5;
        int y=-x;
        System.out.println(y);
        // pre increment
        x+=1;
        System.out.println(x);
        ++x;
        System.out.println(x);
        // post increment
        int z=8;
        System.out.println(z++); // use the z  first and then increment, it doesn't show the upgraded value ;
        System.out.println(z);
        // post decrement
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);


    }
}
