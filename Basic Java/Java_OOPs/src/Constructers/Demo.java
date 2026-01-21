package Constructers;

class Human{
    private  int age;
    private  String name;

    public Human(){

        age =20;
        name="tiku";
        System.out.println("In constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {

        // every time while creating a object it calls the constructor
        Human human = new Human();
//        human.setAge(20);
//        human.setName("Tiku");


        System.out.println(human.getName() + " : " + human.getAge());

    }

}
