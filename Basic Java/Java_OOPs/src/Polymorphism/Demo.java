package Polymorphism;

 class  A{
    public void show(){
        System.out.println(" i am in class A");
    }
 }
 class B extends A{

 }

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }

}
