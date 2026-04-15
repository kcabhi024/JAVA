package Inheritance;

class Animal{

    void show(){

        String a= " this is animal";
        int leg =4;

        System.out.println(a);
        System.out.println("it has a " + leg + " legs");
    }

}

class Dog extends Animal{

   private boolean isCarni = true;
    private String sound ="bark";

    @Override
    public void show(){

        super.show();
        System.out.println(" Is a Carni " + isCarni);
        System.out.println("What its sound " + sound);
    }



}
class Cat extends Animal{


     private boolean isCarni = true;
     private String sound ="Meow";

     @Override
    public void show(){

         super.show();
        System.out.println(" Is a Carni " + isCarni);
        System.out.println("What its sound " + sound);
    }

}
class Cow extends Animal{

    private boolean isCarni = false;
    private String sound ="baaawww";


    @Override
    public void show(){

        super.show();
        System.out.println(" Is a Carni ? " + isCarni);
        System.out.println("What its sound " + sound);
    }
}


public class Demo {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.show();

        Cat cat = new Cat();
        cat.show();

        Cow cow = new Cow();
        cow.show();

    }
}
