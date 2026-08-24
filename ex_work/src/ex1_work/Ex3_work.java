package ex1_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        // 정수 3개를 입력받아서 가장 큰 수를 출력하세요.
        // 1번째 수: 15
        // 2번째 수: 8
        // 3번째 수: 23

        // 가장 큰 수: 23

        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 수 : ");
        int n1 = sc.nextInt();
        System.out.print("2번째 수 : ");
        int n2 = sc.nextInt();
        System.out.print("3번째 수 : ");
        int n3 = sc.nextInt();

        int max = n1;

        if (n2 > max) {
            max = n2;
        }

        if (n3 > max) {
            max = n3;
        }

        System.out.println(max);

    }// main
}
