package ex1_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        // 정수 N을 입력받아서 1부터 N까지의 합을 출력하세요.
        // N 입력: 10
        // 1부터 10까지의 합: 55

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        int cnt = 0;

        for (int i = 1; i <= n; i++) {

            cnt += i;
            
        }
        
        System.out.println("결과 : " + cnt);

    }// main
}
