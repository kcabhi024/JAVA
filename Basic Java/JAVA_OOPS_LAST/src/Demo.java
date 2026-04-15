interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Class B");
    }
}

class C extends B {
    public void show() {
        System.out.println("Class C");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new C();
        obj.show();
    }
}