package ex3_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        // 정수 5개를 입력받아서 가장 큰 수와 가장 작은 수를 출력하세요.
        // 숫자 입력: 7
        // 숫자 입력: 3
        // 숫자 입력: 15
        // 숫자 입력: 2
        // 숫자 입력: 9

        // 최대값: 15
        // 최소값: 2

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int num = sc.nextInt();

        int max = num;
        int min = num;

        for (int i = 1; i < 5; i++) {
            System.out.print("숫자 입력: ");
            num = sc.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

    }// main
}
