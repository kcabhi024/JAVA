package Array;

class  StudentInfo{
    int rollNo;
    String name ;
    int marks ;
}

public class Students {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.rollNo =1;
        s1.name= "Abhi";
        s1.marks= 39;

        StudentInfo s2 = new StudentInfo();
        s2.rollNo =2;
        s2.name= "Ram";
        s2.marks= 45;

        StudentInfo s3 = new StudentInfo();
        s3.rollNo=3;
        s3.name= "Laxu";
        s3.marks= 78;

        StudentInfo studentInfo[] = new StudentInfo[3];
        studentInfo[0]=s1;
        studentInfo[1]=s2;
        studentInfo[2] =s3;

        // using enhanced for each loop

        for(StudentInfo std : studentInfo){
            System.out.println(std.name + " : "  + std.marks);
        }

/*
 this is normal for loop
        for(int i=0; i< studentInfo.length ; i++){
            System.out.println(studentInfo[i].name + " " + studentInfo[i].marks + "  ");
        }


        */

        /*
        int num[] = new int[4];

        num[0] = 4;
        num[1] = 5;
        num[2] = 7;
        num[3] = 8;


        //using enhanced for each loop

        for (int n: num){
            System.out.println(n);
        }

*/

    }


}
