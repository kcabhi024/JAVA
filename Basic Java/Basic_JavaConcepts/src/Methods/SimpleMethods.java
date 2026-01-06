package Methods;

class Computer{
    // in the class methods means the behaviours ;
    // every method  has an access modifier ;


    public void PlayMusic(){
        // void does not return anything it just operates
        System.out.println("Playing music");
    }
    public String getMePen(int cost){
        // string shows the return type of pen
        if (cost>=10)
            return "Pen";
        else
            return "nothing ";
    }

}

public class SimpleMethods {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.PlayMusic();
        String a =computer.getMePen(5);
        System.out.println(a);

    }
}
