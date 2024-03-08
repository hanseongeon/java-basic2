package day5.ConstuctorExam;

public class ConstuctorExam5 {
    // 문제 : 아래와 같이 출력 되도록 해주세요.


    public static void main(String[] args) {
        사람4 a사람 = new 사람4();
        int 엄지손가락_길이 = a사람.a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}

class 사람4 {
    팔2 a왼팔;

    public 사람4() {
        a왼팔 = new 팔2();
        a왼팔.a손 = new 손();
        a왼팔.a손.a엄지손가락 = new 엄지손가락();
        a왼팔.a손.a엄지손가락.길이 = 5;
    }
}

class 팔2 {
    손 a손;
}

class 손 {
    엄지손가락 a엄지손가락;
}

class 엄지손가락 {
    int 길이;
}