package day6.InputExam;
// Scanner를 이용해 입력값을 받아
// 구구단을 원하는 단이 나오게 해주세요.

//예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

import java.util.Scanner;

// 4단 출력.
public class InputExam2 {
    public static void main(String[] args) {

        System.out.println("단을 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        System.out.printf("%d단\n",dan);
        for(int i =1 ; i <10; i++){
            System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }


    }
}
