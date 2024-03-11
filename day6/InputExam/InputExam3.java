package day6.InputExam;
import java.util.Scanner;
// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
public class InputExam3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.


        System.out.println("이름을 입력해주세요:");
        String name = scan.nextLine();
        System.out.println("나이를 입력해주세요:");
        int age = scan.nextInt();
        System.out.printf("안녕하세요 %d세 %s입니다.\n",age,name);

        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 버퍼 찌거기 때문에 입력 또이는 것 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        System.out.println("나이를 입력해주세요:");
        age = scan.nextInt();
        scan.nextLine(); // 버퍼 비우기
        System.out.println("이름을 입력해주세요:");
        name = scan.nextLine();
        System.out.printf("안녕하세요 %d세 %s입니다.\n",age,name);


        // 2.  입력을  nextLine으로 통일한다.
        // 후 Integer.parseInt(); 를 통해 int로 형변환한다.
        System.out.println("나이를 입력해주세요:");
        int age2 = Integer.parseInt(scan.nextLine());
        System.out.println("이름을 입력해주세요:");
        name = scan.nextLine();
        System.out.printf("안녕하세요 %d세 %s입니다.\n",age2,name);


    }

}
