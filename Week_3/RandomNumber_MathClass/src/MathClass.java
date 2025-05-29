public class MathClass {

    public static void main(String[] args) {
        // System.out.println(Math.abs(-99)); // for absolute value
//        System.out.println(Math.ceil(5.006));
//        System.out.println(Math.floor(5.006));
//        System.out.println(Math.round(5.67));


        System.out.println(Math.PI);

        //for round



        for (int i=0 ; i<10; i++){
            long rand = Math.round(Math.random()*1000);
            System.out.println(rand);
        }

    }
}
