package StringExample;

public class StringExample {

    public static void main(String[] args) {

        // string  primitive data type haina.. String euta class ho
        String name = new String();
        name ="abhi ";

        // yo euta string lai add garne way ho
        String  cast = new String( name + "K.c");

//        System.out.println(cast);

        // method of string haru

        System.out.println(cast.concat(" from sarlahi")); // yo concat euta method ho
        // concat lae add garxa string ma
        System.out.println(cast.charAt(3));// yo lae kun index ma kin character xa vanne  help garxa
        System.out.println(cast.toLowerCase());
        System.out.println(cast.toUpperCase());



    }
}
