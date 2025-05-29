public class ArrayToString {
 // concat array using string builder


    public static void main(String[] args) {

        String [] arr =new String[]{"hi", "i", "am", "abhi",
                "kc", "currently", "reading", "java", "class."};

        StringBuilder sb= new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
