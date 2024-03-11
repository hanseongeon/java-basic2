package day6.AccessModifierExam;

// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class AccessModifierExam2 {
    public static void main(String[] args) {

        Person1 p1 = new Person1();

        // 구현시작
        p1.setId(20);
        System.out.println("제 번호는 " + p1.getId() + " 입니다.");
        // 구현끝

        // 출력 : 제 번호는 20 입니다.

    }
}


class Person1 {
    private int id;
    private int age;
    private String name;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    // 카멜표기법: 단어 여러개 조합해서 명명할 때 의미가 바뀌는 부분에서 대문자로 넣어주는 방식
//    public void setId (int a) {
//        this.id += a;
//    }
//
//    int getID() {
//        return id;
//    }

// alt + insert => getter,setter
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
