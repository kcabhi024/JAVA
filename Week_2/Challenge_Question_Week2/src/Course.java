 class Course {
    static int maxCapacity=100;
    String courseName;
    int enrollments;

    String[] enrollStudent;


     Course(String courseName){
         this.courseName=courseName;
         this.enrollments =0;
         this.enrollStudent =new String[maxCapacity];

     }
    static  void setMaxCapacity(int maxCapacity){
        Course.maxCapacity =maxCapacity;
    }
    void enrollStudents(String studentsName){
        enrollStudent[enrollments] =studentsName;
        enrollments++;
    }
     void unEnrollStudents(String studentsName){
         System.out.println("unenrolled");
         enrollments--;
     }

     public static void main(String[] args) {
         Course bca = new Course("bca");
         bca.enrollStudents("hari");
     }

}
