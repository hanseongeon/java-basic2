package day2;

public class DoubleLoopExam {
    public static void main(String[] args) {

        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기

        for (int dan = 2; dan < 10; dan++) {
            System.out.printf("%d단\n", dan);
            for (int i = 2; i < 10; i += 2) {
                System.out.printf("%d x %d = " + dan * i + "\n", dan, i);
            }
        }

        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (int dan = 4; dan < 21; dan++) {
            System.out.printf("%d단\n", dan);
            for (int i = 2; i < 11; i += 2) {
                System.out.printf("%d x %d = " + dan * i + "\n", dan, i);
            }
        }

        // 삼각형 그리기
        for (int i = 1; i < 8; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 삼각형 그리기(역방향)
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }


    }
}
