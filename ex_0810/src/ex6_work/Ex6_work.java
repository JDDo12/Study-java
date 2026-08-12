package ex6_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {

        // 키보드에서 출력될 수열의 개수를 지정하고
        // 피보나치수열대로 결과 보여주기
        // ----------------------------------
        // 피보나치수열
        // 입력 : 8
        // 1 1 2 3 5 8 13 21

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int n = sc.nextInt();

        int a = 1;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

        } // for

    }// main
}
