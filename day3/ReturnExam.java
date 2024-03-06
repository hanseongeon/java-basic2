package day3;

public class ReturnExam {
    public static int func1() {
        return 10;
    }

    public static int func2(int a) {
        return a;
    }

    public static int func3(int a) {
        return a * a;
    }

    public static int func4(int a, int b) {
        return a + b;
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static boolean isNegative(int a) {
        if (a > 0) {
            return false;
        } else {
            return true;
        }
    }

    // 성언풀이 오답.
//    public static int[] isEven(int num) {
//        int[] i = new int[num];
//        for (int a = 1; a < num + 1; a++) {
//            if (num % a == 0) {
//                if(a % 2 == 0) {
//                    i[a-1] = a;
//                }
//            }
//        }
//        return i;
//    }
//
//    public static void printEven(int n) {
//        int[] b = isEven(n);
//       for( int a : b){
//           if(a != 0) {
//               System.out.println(a);
//           }
//       }
//        // isEven 메서드를 이용.
//
//    }

    //GPT 풀이
    public static int[] isEven(int num) {
        int count = 0;
        // 1부터 num까지의 짝수의 개수를 세기
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] evenNumbers = new int[count];
        int index = 0;
        // 1부터 num까지의 짝수를 배열에 저장
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
        }
        return evenNumbers;
    }

    public static void printEven(int n) {
        int[] b = isEven(n);
        for (int a : b) {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        int a = func1();
        System.out.println(a);
        // 출력 : 10
        int b = func1();
        System.out.println(b);
        // 출력 : 10

        int c = func2(22);
        System.out.println(c);
        // 출력 : 22

        int d = func2(55);
        System.out.println(d);
        // 출력 : 55

        int e = func3(10);
        System.out.println(e);
        // 출력 : 100
        int f = func3(5);
        System.out.println(f);
        // 출력 : 25

        int g = func4(10, 30);
        System.out.println(g);
        // 출력 : 40

        int h = func4(20, 50);
        System.out.println(h);
        // 출력 : 70
        System.out.println("1번 문제 종료.\n");

        int rst1 = plus(10, 20);
        System.out.println(rst1);  // 출력 : 30

        int rst2 = minus(10, 20);
        System.out.println(rst2); // 출력 : -10

        int rst3 = multiple(5, 4);
        System.out.println(rst3); // 출력 : 20

        int rst4 = divide(10, 3);
        System.out.println(rst4); // 출력 : 3

        int rst5 = square(5);
        System.out.println(rst5); // 출력 : 25

        System.out.println("2번 문제 종료.\n");


        // 0은 양수로 보겠습니다.
        int no = 10;

        if (isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.S

        System.out.println("3번 문제 종료.\n");

        // 1 부터 n까지 수 중 짝수인 것만 출력

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4

        System.out.println("4번 문제 종료.\n");
    }
}
