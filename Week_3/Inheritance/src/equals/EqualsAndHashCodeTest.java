package equals;

public class EqualsAndHashCodeTest {

    public static void main(String[] args) {
        Person person = new Person("abhi", 21, "102");
        Person person1 =new Person("hari" ,21,"101");
        Person person2 =new Person("hari" ,21,"101");
        if(person1.equals(person2)){
            System.out.println("equals");
        }
        else {
            System.out.println("Not equals");
        }

    }
}
