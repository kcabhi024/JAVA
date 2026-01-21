package Encapsulation;

class Person{
        private String name;
        private int age;

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
public class ThisKeywordExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("abhi");
        p.setAge(21);

        System.out.println(p.getAge() + " " + p.getName()+ "  ");

    }
}
