package ThisKeyWord;


class  Pet{

    // this keyword belongs to the class object ..


    int noOfLegs = 4;
    String name ;
    String breed;


    public void CatInfo(int noOfLegs, String name, String breed){

        // concept of this keyword
        this.noOfLegs =noOfLegs;
        System.out.println("  leg : " + noOfLegs + " name  : " + name +  " breed  : "+ breed);

    }
    public void DogInfo(int noOfLegs, String name, String breed){

        noOfLegs =5;

        System.out.println("  leg : " + noOfLegs + " name  : " + name +  " breed  : "+ breed);
//        System.out.println(noOfLegs +" : " +  name + " : " + breed);

    }




}

public class Demo {
    public static void main(String[] args) {

        Pet cat = new Pet();

        cat.name ="meow meow";
        cat.breed = "abc";

        Pet dog = new Pet();
        dog.name =" bhau bhau";
        dog.breed= "labrador";

        cat.CatInfo(cat.noOfLegs, cat.name, cat.breed);
        dog.DogInfo(dog.noOfLegs, dog.name, dog.breed);

    }




}
