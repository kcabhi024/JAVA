public class StringFormat {
    public static void main(String[] args) {
        String name ="abhi";
        int marks = 40;
        System.out.println("hello "+ name + " yours mark is " + marks);


        // in numbers %,15 is used to get ,
        //%+,d is used to get + at first and - for minus

        System.out.printf("hello %15s your marks is %d",name,marks);
        // %15s is used to take 15spaces form front // and - used to takes space in back side
        // %S (in capital) is used to make all capital



    }

}
