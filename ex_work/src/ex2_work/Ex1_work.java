package ex2_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {

        // 정수 하나를 입력받아서 양수인지, 음수인지, 0인지 출력하세요.
        // 숫자 입력: -5
        // 음수입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("음수입니다");
        } else if (n > 0) {
            System.out.println("양수입니다");
        } else {
            System.out.println("0");
        }

    }// main
}
