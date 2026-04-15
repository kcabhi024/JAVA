package Encapsulation;

class Student{

    private  int id;
    private String name;
    private int age;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationEg {

    public static void main(String[] args) {

        Student st =new Student();
        st.setId(101);
        st.setName("Bahadur");
        st.setAge(22);


        System.out.println("ID: "+ st.getId()+ "  Name : " + st.getName() + "  Age :" + st.getAge());

    }

}
