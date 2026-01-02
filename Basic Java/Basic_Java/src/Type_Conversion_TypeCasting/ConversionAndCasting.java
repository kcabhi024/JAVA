package Type_Conversion_TypeCasting;

public class ConversionAndCasting {

    public static void main(String[] args) {

        // type Conversion convert the values  i.e byte into  integer
        // implicit byte into a integer

        // casting help to convert into a byte into a integer (explicit conversion)

        // for eg :

       //  int x= 5.6; this will not work because int does not support the float value

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x); // its is explicit conversion also called casting

       // byte b =127 ;   max value is 127 of byte
        int a =1200;
        byte k = (byte)a;
        System.out.println(k);

        // example of type promotion
        byte m= 10;
        byte n= 30;

        int result =m*n;
        System.out.println(result);





    }
}
