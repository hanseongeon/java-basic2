package day2;

public class IncDecOperator {
    public static void main(String[] args) {

        // 증감연산자
        int num = 10;
        System.out.println(num + 5);

        // 변수의 값을 5증가시키고 싶다.
        // num = 15; // 증가 x
        num = num + 5;
        num += 5;

        // 변수의 값을 3 감소시키고 싶다.
        num -= 3;

        // 증감연산자

        num++; // 증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num--; // 감소값이 1인 경우에 한해서는 num-- 라고 쓸 수 있다.

        System.out.println(num);

    }
}
