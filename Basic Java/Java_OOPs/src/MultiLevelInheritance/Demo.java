package MultiLevelInheritance;

public class Demo {

    // multi level inheritance

    public static void main(String[] args) {
        AdvanceLevelCalculator calculator = new AdvanceLevelCalculator();
        int a1 =calculator.add(4,5);
        int a2 =calculator.sub(7,2);
        int a3 =calculator.mul(3,5);
        double a4 = calculator.div(5,3);
        double a5= calculator.power(3,2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}
