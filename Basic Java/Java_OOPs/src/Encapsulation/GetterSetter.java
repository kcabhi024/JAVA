package Encapsulation;

class Human1 {

    private int age;
    private  String name;

    // private are accessed by only method i.e their own method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class GetterSetter {

    public static void main(String[] args) {

        Human obj = new Human();
//          obj.name ="Abhi";
        obj.setAge(21);
        obj.setName("Abhihsek ");

        System.out.println(obj.getAge() +  " " + obj.getName());
    }

}
