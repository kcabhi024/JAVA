package LambdaExpression;

@FunctionalInterface
interface  A{
    void show();
}

public class Demo{

    public static void main(String[] args) {
        // this is a normal object creation
//        A a = new A() {
//            @Override
//            public void show() {
//                System.out.println("in show ");
//
//            }
//        };

        // using a lambda expression
        A s = () -> System.out.println("in show");
        s.show();
    }

}
