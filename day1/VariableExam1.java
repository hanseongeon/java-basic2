package day1;

public class VariableExam1 {
    public  static  void main(String[] args){
        // Exam1
        int i = 100;
        double d = 3.14;
        String s = "안녕하세요";
        System.out.println(i); // 출력 : 100

        System.out.println(d); // 출력 : 3.14

        System.out.println(s); // 출력 : 안녕하세요

        i = 200;
        d = 10.5;
        s = "반갑습니다.";
        System.out.println(i); // 출력 : 200

        System.out.println(d); // 출력 : 10.5

        System.out.println(s); // 출력 : 반갑습니다.

        // Exam2
        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        a = 10;
        b = 5;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}
