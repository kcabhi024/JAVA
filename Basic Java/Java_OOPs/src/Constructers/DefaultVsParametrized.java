package Constructers;

class  Human1{
    private int  age = 12;
    private  String name = "abhi";

    public Human1(){
        age= 21;
        name = "tiku";
    }
    public Human1(int a , String s){
        age =a ;
        name =s ;
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

public class DefaultVsParametrized {
    public static void main(String[] args) {

        Human1 h = new Human1();
        Human1 h1 = new Human1(12,"abhi");

        System.out.println(h.getAge() + " " + h.getName());
        System.out.println(h1.getAge()+ " " + h1.getName());


    }

}
