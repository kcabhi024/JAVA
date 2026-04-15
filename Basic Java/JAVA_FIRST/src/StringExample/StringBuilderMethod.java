package StringExample;

public class StringBuilderMethod {

    public static void main(String[] args) {

    // yeso garda chai object heap ma banxa ani new heap ma thau  banxa so equal hunna
        String  a= new String("abhi");
        String b= new String("abhi");

        if(a==b)
            System.out.println("equals");
        else
            System.out.println("Not equal");

        // yo garda equal hunxa kina vane .equals lae length ani char lai compare  garxa

        System.out.println(a.equals(b));

        System.out.println("\n");

        // yesto garda .. string pool ma chai a ko value basxa. ani b pani same huda
        // string pool bata nai value lenxa new banaudaina.. so easy memory management hunxa
        String a1= "dada";
        String b1 ="dada";

        System.out.println(a1==b1);

        // string builder ra buffer chai mutable ko lagi use hunxa

        // yesko dhrai method hunxa.. to delete char at index, to add word between.. to show capacity
        // so mutable vanya ho

        StringBuffer buff = new StringBuffer("abhi");
        System.out.println(buff.capacity());
        buff.append(" kc");
        System.out.println(buff);

        StringBuilder sb = new StringBuilder("hi abhi ");
        sb.append("k xa");
        System.out.println(sb);

    }





}
