package String;

public class MutableAndImmutable {


//    mutable string is achieved by string buffer and the string builder


    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Abhi");
        sb.append(" Kc"); // it adds the string

        System.out.println(sb.length());

        System.out.println(sb.capacity()); // it gives default 16 bytes of size
        // we can perform many thing
        // delete character at index
        //set length
        // insert data
        sb.insert(4, " java");


        System.out.println(sb);


    }
}
