class Student{
    int rolling;
    String name;
    int marks;
}

public class ArrayObj {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rolling = 1;
        s1.name = "Steve";
        s1.marks = 97;

        Student s2 = new Student();
        s2.rolling = 1;
        s2.name = "Friter";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rolling = 1;
        s3.name = "Dietz";
        s3.marks = 80;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i < students.length; i++){
        //     System.out.println(students[i].name + " " + students[i].marks);
        // }

        // Enhanced for loop | for each
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}
