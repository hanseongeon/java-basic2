package day2;

public class DoubleLoop {
    public static void main(String[] args) {

        for (int a = 1; a < 4; a++) {
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
            }
        }

        // 구구단 2 ~ 9 단 출력
        for (int dan = 2; dan < 10; dan++) {
            System.out.printf("%d단\n", dan);
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d x %d = " + dan * i + "\n", dan, i);
            }
        }

        // 2단 8번 출력
        int dan = 2;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = " + dan * j + "\n", dan, j);
            }
        }

    }
}
