package Method;

class Laptop{

    public void PlayMusic(){
        System.out.println("Music is playing");
    }

    public String ShowBatteryStatus( int health){
        if (health>80){
            return "Very Good";
        }
        else if(health<80 && health>20){
            return "Good";
        }
        else {
            return "Poor";
        }

    }
}

public class Main {

    public static void main(String[] args) {

        Laptop obj= new Laptop();

        obj.PlayMusic();
        String str = obj.ShowBatteryStatus(90);
        System.out.println(str);
    }
}
