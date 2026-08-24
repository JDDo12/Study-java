package ex1_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {

        // 정수 2개를 입력받아서 두 수의 합을 출력하세요.
        // 첫 번째 수: 10
        // 두 번째 수: 20
        // 합: 30

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int su1 = sc.nextInt();

        System.out.print("수2 : ");
        int su2 = sc.nextInt();

        System.out.println("합 : " + (su1 + su2));

       

    }// main
}
