package day2;

public class ArrayExam {
    public static void main(String[] args) {

        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.

        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("문제1번 종료");
        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println(arr2[j]);
            }
        }
        System.out.println("문제2번 종료");

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.println(arr3[i]);
        }
        System.out.println("문제3번 종료");

        // 배열 안의 숫자들의 합을 구해주세요.
        int[] arr4 = {10, 20, 30, 40, 50};
        int hap = 0;
        for (int i = 0; i < arr4.length; i++) {
            hap += arr4[i];
        }
        System.out.println(hap);
        System.out.println("문제4번 종료");

    }
}
