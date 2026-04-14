package ConstructorEg;



class Student{
//    int Id;
//    String Name;
//    String Block;
//    String Faculty;

    // constructor has no return type .... constructor itself is a method


    //  it is a default constructor.
    public Student(){

        System.out.println(" i am in constructor");

    }

    public Student(String block, int id, String name, String faculty) {

    }

    // it is a parameterized constructor
    public Student(int Id, String name){

        System.out.println( Id + " : "+ name);

    }

    // this is a static method
//    static  void Display(){
//        System.out.println(" i am in a Static method");
//    }
    // this is a normal method
//    public  void DisplayInfo(){
//        System.out.println(" i am in method ");
//    }



}

public class Demo {

    public static void main(String[] args) {

        Student st = new Student(101,"Hari");
//        st.DisplayInfo();
//        Student.Display();


    }
}
