import java.util.function.DoubleFunction;

public class Main {


    public  static  void  main(String[] args){
        Student s1 = new Student(187654,"박고고");
        s1.printInfo();

    }
}
class Student{
    int studentId;
    String studenName;

    Student(int a,String b){
        studentId = a;
        studenName = b;
    }

    void printInfo(){
        System.out.printf("학생이름 : %s\n",studenName);
        System.out.printf("학번 : %d\n",studentId );
    }
}