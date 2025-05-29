 class CarFinal {

    // program to create an object with final fields and constructor to initialize them
     final  int numberOfWheels;

     final String modelNo;

     public CarFinal(int numberOfWheels, String modelNo) {
         this.numberOfWheels = numberOfWheels;
         this.modelNo = modelNo;
     }

     public static void main(String[] args) {

         CarFinal car =new CarFinal(4,"wm2345");
         System.out.println(car.modelNo);

     }
}
