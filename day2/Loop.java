package day2;

public class Loop {
    public static void main(String[] args) {

        // 반복문을 이용해 동일한 명령을 여러번 실행

        // while
//        while(true){
//            System.out.println("실행");
//        }

        // 원하는 만큼만 반복
        int cnt = 0;
        while(cnt <= 4){
            System.out.println("실행");
            cnt++;
        }

        // for 문
        for(int cnt2 = 0; cnt2 <= 4; cnt2++ ){
            System.out.println("실행");
        }

        // 1부터 10까지 반복
        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력
        for(int a = 2; a <=10; a+=2){
            System.out.println(a);
        }

        // 1부터 10까지 짝수 출력 (짝수일때만 출력)
        for(int a =1; a<=10; a++){
            if(a % 2 ==0){
                System.out.println(a);
            }
        }

        // 1부터 10까지 4의 배수 출력
        for(int f = 4; f <= 10; f+=4){
            System.out.println(f);
        }






    }
}
