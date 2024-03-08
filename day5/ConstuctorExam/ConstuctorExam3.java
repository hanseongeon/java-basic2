package day5.ConstuctorExam;
// 출력 : 아래와 같이 출력되게 해주세요.
public class ConstuctorExam3 {
    public static void main(String[] args) {
        new 사람1(100).걷다();

        System.out.println(new 사람1(100).a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람1 {
    팔1 a왼팔;

    public 사람1(int 길이){
        a왼팔 = new 팔1();
        a왼팔.길이 = 길이;
    }
    void 걷다() {
        System.out.println("사람 걷는다.");
    }
}

class 팔1 {
    int 길이;
}