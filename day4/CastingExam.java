package day4;

public class CastingExam {
    public static void main(String[] args) {
        // 변수는 수정하지 않습니다.
        int num1 = 10;
        int num2 = 4;

        System.out.println((double) num1 / (double) num2); // 출력 : 2.5

        System.out.println("문제 1번 종료");

        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        a무기.공격();
        // 출력 : 활로 공격합니다.

        System.out.println("문제 2번 종료");
    }
}

//class 무기{
//   public void 공격(){
//       System.out.println("무기로 공격합니다.");
//   }
//}
//class  활 extends 무기{
//    public void 공격(){
//        System.out.println("활로 공격합니다.");
//    }
//}
//
//class 칼 extends 무기{
//    public void 공격(){
//        System.out.println("칼로 공격합니다.");
//    }
//}