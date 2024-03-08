package day5;

public class DuckSimulation {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();
        // 출력 : 저는 날 수 없어요..
        // 출력 : 오리가 둥둥 떠다닙니다.

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 둥둥 떠다닙니다.
    }
}
abstract class 날개아이템 {
    abstract void 사용();
}
class 날개 extends 날개아이템 {
    void 사용() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 고무날개 extends 날개아이템 {
    void 사용() {
        System.out.println("저는 날 수 없어요..");
    }
}

class 불사조날개 extends 날개아이템 {
    void 사용() {
        System.out.println("불사조가 날개로 날아갑니다.");
    }
}

abstract class 발아이템 {
    abstract void 사용();
}

class 발 extends 발아이템 {
    void 사용() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}


class 고무발 extends 발아이템 {
    void 사용() {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
class 오리 {
    날개아이템 a날개 = new 날개();
    발아이템 a발 = new 발();

    public void 날다() {
        a날개.사용();
    }

    public void 헤엄치다() {
        a발.사용();
    }

}

class 청둥오리 extends 오리 {
}

class 흰오리 extends 오리 {
}

class 고무오리 extends 오리 {

    고무오리() {
        a날개 = new 고무날개();
        a발 = new 고무발();
    }

}

class 고무2오리 extends 고무오리 {

}

class 아수라오리 extends 오리 {

    아수라오리() {
        a날개 = new 불사조날개();
        a발 = new 고무발();
    }
}


// 오리 시뮬레이션을 구성을 이용해 중복없이 아래와 같이 출력되게 해주세요.
// 힌트 : 오리에게 날개와 발을 부여하고 날때는 날개를 헤엄칠 때는 발을 사용하게 해보세요.

//public class DuckSimulation {
//    public static void main(String[] args) {
//
//        청둥오리 a청둥오리 = new 청둥오리();
//        a청둥오리.날다();
//        a청둥오리.헤엄치다();
//        // 출력 : 오리가 날개로 날아갑니다.
//        // 출력 : 오리가 오리발로 헤엄칩니다.
//
//        흰오리 a흰오리 = new 흰오리();
//        a흰오리.날다();
//        a흰오리.헤엄치다();
//        // 출력 : 오리가 날개로 날아갑니다.
//        // 출력 : 오리가 오리발로 헤엄칩니다.
//
//        고무오리 a고무오리 = new 고무오리();
//        a고무오리.날다();
//        a고무오리.헤엄치다();
//        // 출력 : 저는 날 수 없어요..
//        // 출력 : 오리가 둥둥 떠다닙니다.
//
//        아수라오리 a아수라오리 = new 아수라오리();
//        a아수라오리.날다();
//        a아수라오리.헤엄치다();
//        // 출력 : 오리가 날개로 날아갑니다.
//        // 출력 : 오리가 둥둥 떠다닙니다.
//
//
//    }
//}
//
//class 오리 {
//    날개 a날개 = new 날개();
//    오리발 a오리발 = new 오리발();
//    public void 날다() {
//        a날개.사용();
//    }
//
//    public void 헤엄치다() {
//       a오리발.사용();
//    }
//
//}
//class 청둥오리 extends 오리 {
//}
//
//class 흰오리 extends 오리 {
//}
//
//class 고무오리 extends 오리 {
//
//    고무날개 a고무날개 = new 고무날개();
//    고무오리발 a고무오리발 = new 고무오리발();
//    public void 날다() {
//      a고무날개.사용();
//    }
//
//    public void 헤엄치다() {
//        a고무오리발.사용();
//    }
//}
//
//class 고무2오리 extends 고무오리 {
//
//}
//
//class 아수라오리 extends 고무오리 {
//    public void 날다() {
//        a날개.사용();
//    }
//
//    public void 헤엄치다() {
//        a고무오리발.사용();
//    }
//
//}
//
//class 날개 {
//
//    public void 사용(){
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//}
//
//
//
//
//class 오리발{
//
//    public void 사용(){
//        System.out.println("오리가 오리발로 헤엄칩니다.");
//    }
//}
//
//class 고무날개{
//    public void 사용(){
//        System.out.println("고무날개로는 날수가 없습니다..ㅜㅠ");
//    }
//}
//
//class 고무오리발{
//    public void 사용(){
//        System.out.println("고무오리발로는 헤엄칠수가없어 둥둥 떠다닙니다.");
//    }
//}