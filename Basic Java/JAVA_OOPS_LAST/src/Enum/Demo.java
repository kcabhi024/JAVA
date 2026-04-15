package Enum;
// enum is a constant data or a status


// lamdra expressions also;


interface A{
    void show();
}

enum Status{
    Approved, Pending, Success,Failed;
}

public class Demo {

    public static void main(String[] args) {


        Status s = Status.Success;
        System.out.println(s);

        // this is a lamda expression it short the code

        A obj = ()->
                System.out.println("Done");

        obj.show();

    }
}
