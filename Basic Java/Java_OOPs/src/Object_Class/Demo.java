package Object_Class;


class  Laptop{
    String name;
    int price;

    public String toString(){
        return  name + " " + price;
    }

    public boolean equals (Laptop that){

        return  this.name.equals(that.name) && this.price == that.price;
    }
}

public class Demo {

    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.name = "dell";
        obj1.price =1200;

        Laptop obj2 = new Laptop();
        obj2.name = "dell";
        obj2.price =1200;

        boolean res = obj1.equals(obj2);

        System.out.println(res);
    }
}
