package Encapsulation;

class Human {

     private int age;
     private  String name;

     // private are accessed by only method i.e their own method
     public int  getAge(){
          return  age;
     }
     public void setAge(int  a ){
          age =a;
     }
     public String getName(){
          return  name;
     }
     public void setName(String n){
          name =n;
     }
}

public class Demo {

     public static void main(String[] args) {

          Human obj = new Human();
//          obj.name ="Abhi";
          obj.setAge(21);
          obj.setName("Abhihsek ");

          System.out.println(obj.getAge() +  " " + obj.getName());
     }

}
