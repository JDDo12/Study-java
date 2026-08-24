package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {

        // 컴퓨터가 1~100 사이의 숫자 하나를 정해놓습니다.

        // 사용자가 숫자를 입력하면:

        // 정답보다 크면 → 더 작은 숫자입니다.
        // 정답보다 작으면 → 더 큰 숫자입니다.
        // 정답이면 → 정답입니다!

        // 정답을 맞힐 때까지 while문으로 계속 입력받으세요.

        int rnd = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        // 치트 : System.out.println(rnd);
        int n = 0;
        int cnt = 0;

        while (n != rnd) {
            System.out.print("정답 : ");
            n = sc.nextInt();
            cnt++;

            if (n < rnd) {

                System.out.println("UP");
                
            } else if (n > rnd) {

                System.out.println("DOWN");

            } else {

                System.out.println( cnt + "회 만에 정답~!!!");

            }

        } // while

    }// main
}
