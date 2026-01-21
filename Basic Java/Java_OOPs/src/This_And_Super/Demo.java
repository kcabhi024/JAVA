package This_And_Super;

// every constructor in a java have a method called super, even if it is not mentioned

    class A{
        public A(){
            System.out.println("in A");
        }
        public  A(int a ){
            System.out.println("in a Int");
        }

    }
    class B extends  A{
        public B(){
            // super(3); // it takes the class A parametrized constructors
            System.out.println("In b");
        }
        public B(int a){
            this();
           // super(a); // it called the parameterized constructor
            System.out.println("int B called");
        }
    }

public class Demo {
    public static void main(String[] args) {
        B b = new B(1);

    }
}
