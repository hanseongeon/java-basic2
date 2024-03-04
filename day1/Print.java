package day1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.stream.StreamSource;

public class Print {
    public  static  void  main(String[] args){
        // 숫자 출력
        System.out.println(100);
        System.out.println(200);

        // 프로그램은 위에서 아래로 순차적 실행

        // 문자 출력
        System.out.println("한성언");
        System.out.println("홍길동");

        System.out.println("홍길동의 나이는 : " + 20 + "살입니다.");
        System.out.println("커피");
        System.out.println(20);
        System.out.println(87654324);
        System.out.println("가나다라마바사");
        System.out.println("abcdefg");
        System.out.println(987654321);

        // \n은 줄바꿈
        System.out.println("안녕하세요.\n반갑습니다.");

        // 문자 합치기
        System.out.println("오늘 점심은 "+"뭐먹지?");
        System.out.println("안녕하세요 "+"한성언입니다 "+"반갑습니다");

        // 숫자 더하기(산술연산)
        System.out.println(100 + 200);

        // 숫자와 문자는 정확히 구별해서 사용
        System.out.println("100"+"200");
        System.out.println(100 + 200);

        // 문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        // +연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("123123 + 56563 = " + 123123 + 56563);
        System.out.println("123123 + 56563 = " + (123123 + 56563));

        // 숫자 곱하기 (*)

        System.out.println(100 * 200);

        // 구구단 2단을 출력해주세요.
        System.out.println("2 * 1 = "+ (2 * 1) +"\n" + "2 * 2 = "+ (2 * 2) +"\n" + "2 * 3 = "+ (2 * 3) +"\n" + "2 * 4 = "+ (2 * 4) +"\n" +
                "2 * 5 = "+ (2 * 5) +"\n" + "2 * 6 = "+ (2 * 6) +"\n" + "2 * 7 = "+ (2 * 7) +"\n" + "2 * 8 = "+ (2 * 8) +"\n" + "2 * 9 = "+ (2 * 9) +"\n");

        int dan = 2;
        System.out.printf("%d 단 \n",dan);
        for(int i = 1; i <=9; i++){
            System.out.printf("%d * %d = " + (dan * i) +"\n",dan,i);
        }



    }
}
