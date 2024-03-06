package day3;

public class ParameterExam {

    public static void print(int a) {
        System.out.println(a);
    }

    public static void hi(int a, String name) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("안녕하세요, 저는 %d살 %s입니다.!\n", a, name);
        }
    }

    public static void introduce(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("안녕하세요. 20살 홍길동입니다.!");
        }
    }

    public static void greeting1(int a) {
        if (a == 1) {
            System.out.println("안녕하세요.");
        } else if (a == 2) {
            System.out.println("하이~");
        } else if (a == 3) {
            System.out.println("봉쥬");
        }
    }

    public static void greeting2(int a, int b) {
        for (int i = 0; i < b; i++) {
            if (a == 1) {
                System.out.println("안녕하세요.");
            } else if (a == 2) {
                System.out.println("하이~");
            } else if (a == 3) {
                System.out.println("봉쥬");
            }
        }
    }

    public static void main(String[] args) {

        print(4); // 출력: 4
        print(10); // 출력: 10
        print(100); // 출력: 100

        System.out.println("문제1번 종료\n");

        hi(20, "홍길동");

        System.out.println("문제2번 종료\n");

        introduce(3);

        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        System.out.println("");
        introduce(5);
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        System.out.println("");
        introduce(10);
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        System.out.println("");
        System.out.println("문제3번 종료\n");

        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~
        System.out.println("");

        greeting1(3);
        // 봉쥬
        System.out.println("");

        greeting1(1);
        // 안녕하세요
        System.out.println("");

        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요
        System.out.println("");

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        System.out.println("");

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬

        System.out.println("문제4번 종료");
    }
}
