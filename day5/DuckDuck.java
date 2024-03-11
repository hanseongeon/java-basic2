package day5;

// 백지에서 오리시뮬레이션 연습
public class DuckDuck {
    public static void main(String[] args) {

        청동오리5 a청동오리 = new 청동오리5();
        a청동오리.날다();
        a청동오리.수영();

        흰오리5 a흰오리 = new 흰오리5();
        a흰오리.날다();
        a흰오리.수영();

        고무오리5 a고무오리 = new 고무오리5();
        a고무오리.날다();
        a고무오리.수영();

        아수라오리5 a아수라오리 = new 아수라오리5();
        a아수라오리.날다();
        a아수라오리.수영();


    }
}

class 오리5 {
    날개아이템5 a날개 = new 날개아이템5();
    오리발아이템5 a오리발 = new 오리발아이템5();

    public void 날다() {
        a날개.사용();
    }

    public void 수영() {
        a오리발.사용();
    }
}

class 청동오리5 extends 오리5 {

}

class 흰오리5 extends 오리5 {

}

class 고무오리5 extends 오리5 {

    고무오리5() {
        a날개 = new 고무날개5();
        a오리발 = new 고무오리발5();
    }
}

class 아수라오리5 extends 고무오리5 {

    아수라오리5() {
        a날개 = new 날개5();
    }
}

class 날개아이템5 {

    public void 사용() {
        System.out.println("날개를 사용하여 날아다닙니다.");
    }
}

class 날개5 extends 날개아이템5 {

}

class 고무날개5 extends 날개아이템5 {

    public void 사용() {
        System.out.println("고무날개는 날수가 없습니다..ㅠ");
    }
}

class 오리발아이템5 {

    public void 사용() {
        System.out.println("오리발을 사용하여 헤엄칩니다.");
    }
}

class 오리발5 extends 오리발아이템5 {

}

class 고무오리발5 extends 오리발아이템5 {
    public void 사용() {
        System.out.println("고무오리발은 헤엄칠수가 없어 둥둥 떠다닙니다 ㅜㅠ..!");
    }
}