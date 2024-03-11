package day6;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 배열의 단점

        int[] arr = new int[10];
        arr[0] = 10;
        arr[9] = 100;

        // 배열은 크기가 고정이라 유연하지 않다.

        // 동적배열 -> 길이를 정하지 않고 유동적으로 변하게 함.
        // 동적배열(ArrayList)은 객체만 저장 가능

        // 원시타입 -> int, double, boolean,...
        // 원시타입을 제외한 자바의 모든 것은 객체다.
        // 원시타입의 객체타입 존재.
        // int -> Integer, double -> Double, boolean -> Boolean

        ArrayList<Integer> list = new ArrayList<>();

        // 값 넣기
        list.add(10); // 0번쨰 인덱스에 10 추가
        list.add(20); // 1번째 인덱스에 20 추가
        list.add(30); // 2번째 인덱스에 30 추가

        // 값 가져오기
        int rst = list.get(1);
        System.out.println(rst); // 1번째 인덱스의 값을 가져옴

        // 값 삭제하기
        list.remove(1); // 1번째 인덱스의 값을 삭제. 값이 지워진 인덳는 이후 값들로 땡겨진다.
        System.out.println(list.get(1)); // 30
//        System.out.println(list.get(2)); // remove 후 2번째 인덱스는 사라짐

        // ArrayList의 크기 확인
        System.out.println(list.size()); //2

        // ArrayList의 모든 값 출력
        // 마지막인덱스는 항상 개수 -1
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int a : list){
            System.out.println(a);
        }
    }
}
