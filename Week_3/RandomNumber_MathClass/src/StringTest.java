public class StringTest {

    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("hi class");
        str.append(12);
        str.append(", this is the class ");
        str.append(75.6);
        str.toString();
        System.out.println(str);
    }
}
