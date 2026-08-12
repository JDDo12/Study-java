package ex6_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        // 입력받은 두 수의 최소공배수
        // -----------------------
        // 수1 : 6
        // 수2 : 10
        // 최대공배수 : 30

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int su1 = sc.nextInt();
        System.out.print("수2 : ");
        int su2 = sc.nextInt();

        int min = 0;

        for (int i = 1; i <= su1; i++) {

            for (int j = 1; j <= su2; j++) {

                if (su1 * i == su2 * j) {
                    min = su1 * i;
                    break;

                }

                if (min != 0) {
                    break;
                }

            } // in

        } // out

        System.out.println("최소공배수 : " + min);

    }// main
}
