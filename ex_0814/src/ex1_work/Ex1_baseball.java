package ex1_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //정답 숫자와 맞춰야 되는 숫자의 배열
        int[] com = new int[3];
        int[] user = new int[3];
        //중복되지 않는 숫자 3개 만들기
        outer: for (int i = 0; i < com.length;) {
            //1~9사이의 중복되지 않는 랜덤 숫자
            com[i] = new Random().nextInt(9) + 1;

            // 중복값 비교
            for (int j = 0; j < i; j++) {

                if (com[i] == com[j]) {
                    //중복이면 숫자 다시 뽑기
                    continue outer;
                }

            } // in

            i++;

        } // out
        //정답 보기
        System.out.println("정답 : " + com[0] + com[1] + com[2]);
        //몇 회 만에 맞췄는지 세기
        int cnt = 0;

        while (true) {

            cnt++;

            System.out.print("입력(예:123) : ");

            int number = sc.nextInt();
            
            user[0] = number / 100;
            user[1] = number / 10 % 10;
            user[2] = number % 10;

            int strike = 0;
            int ball = 0;
            
            for (int i = 0; i < user.length; i++) {

                for (int j = 0; j < user.length; j++) {
                    //숫자, 자리가 똑같으면 스트라이크
                    if (i == j) {
                        if (com[i] == user[j])
                            strike++;
                    //자리 다르고, 숫자만 같으면 볼
                    } else {
                        if (com[i] == user[j])
                            ball++;
                    }

                } // in

            } // out

            // 정답처리
            if (strike == 3) {
                System.out.println("정답!! - " + com[0] + com[1] + com[2]);
                System.out.println(cnt + "회 클리어");
                break;

            } else {
                //스트라이크, 볼이 하나라도 있으면 결과 출력
                if (strike > 0 || ball > 0) {
                    System.out.printf("%d Strike, %d Ball\n", strike, ball);

                } else {
                    //스트라이크, 볼이 없으면 아웃
                    System.out.println("OUT");

                }

            }
            //구분선
            System.out.println("--------------------");

        } // while

    }// main
}
