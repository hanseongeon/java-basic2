package day3;

public class MethodExam {

    public static void hi1() {
        System.out.println("저는 차태진입니다.");
    }

    public static void hi2() {
        System.out.println("안녕하세요.");
    }

    public static void hi3() {
        System.out.println("프로그램을 만들어보아요.");
    }

    public static void hi4() {
        System.out.println("자바를 통해");
    }

    public  static  void  hi(){
        System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
    }
    public  static  void bye(){
        System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }
    public static void main(String[] args) {

        // 메서드를 올바르게 호출해서 아래처럼 출력되게 해주세요.

        // 안녕하세요!!
        // 저는 차태진입니다.
        // 자바를 통해
        // 프로그램을 만들어보아요.

        hi2();
        hi1();
        hi4();
        hi3();

        System.out.println("문제1번 종료");

        hi();
        // 안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.

        bye();
        // 안녕히 가세요. 다음에 또 봐요!

        System.out.println("문제2번 종료");
    }
}
