 class StudentToString {

    String name;
    String rollNo;
    String house;
    int age;

     public StudentToString(String name, String rollNo, String house, int age) {
         this.name = name;
         this.rollNo = rollNo;
         this.house = house;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Student details is : " +
                 "name=' " + name + '\'' +
                 ", rollNo=' " + rollNo + '\'' +
                 ", house=' " + house + '\'' +
                 ", age= " + age +
                 ' ';
     }

     public static void main(String[] args) {
        StudentToString std =new StudentToString("Dada", "a23"
                ,"Annapurna",21);

         System.out.println(std);

    }
}
