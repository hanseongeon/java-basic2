package day6;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // 문자열 이;ㅂ력

        Scanner sc = new Scanner(System.in);

        // 문자열 입력1 -> 단어 입력
        // 문자열 입략2 -> 문장 입력

        String str1 = sc.next(); // 단어 입력. 공백은 입력이 끝나는 시점으로 인식

        // 문장 입력하고 싶으면 nextLine();
        String str2 = sc.nextLine(); // 문장 입력. 엔터를 입력할 때 까지 입력을 받음

        String age2 = sc.nextLine();

        // 문자열 -> 숫자 변환
        int convertedInt = Integer.parseInt((age2));
        System.out.println(convertedInt+100);
    }
}
