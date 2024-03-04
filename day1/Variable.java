package day1;

public class Variable {
    public static void main(String[] args){
        // 변수
        // 변수는 데이터를 저장하는 공간(그릇)

        // 변수 선언
        // 변수타입 변수명;

        // 숫자형 변수
        int number;

        // 변수에 값 저장
        number = 40; // 변수가 왼쪽, 저장 대상이 오른쪽

        // int number2;
        // number2 = "한성언"; // 숫자 변수에 문자를 저장하려고 하면 안됨.

        // String -> 자바에서 문자열을 의미
        String str = "한성언";
        char atr2 ='가';

        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용
        System.out.println(number);

        // 자기소개 10번 출력
        int age = 26;
        String a = "안녕하세요 저는 26살 한성언입니다.";

        System.out.printf("안녕하세요 저는 %d살 한성언입니다.\n",age);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        System.out.println("\n");

        age = 27;
        a = "안녕하세요 저는 27살 한성언입니다.";
        System.out.printf("안녕하세요 저는 %d살 한성언입니다.\n",age);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        // 변수 주의사항
        // 변수명은 중복되지 않도록 지어야 한다.
        // 변수명은 숫자로 시작하면 안된다.
        // 변수는 재활용 가능하다.

    }
}
