package ex3_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 정수 N을 입력받아서 1부터 N까지의 합을 구하세요.
        // 단, for문을 사용하세요.

        // N 입력: 5
        // 합: 15

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            
            sum += i;

        } // for
            
        System.out.println("합 : " + sum);

    }// main
}
