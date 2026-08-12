package ex6_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 두 개의 수의 최대공약수 출력
        // -----------------------------------------
        // 수1 : 10
        // 수2 : 4
        // 최대공약수 : 2
        // -----------------------------------------
        // 수1 : 18
        // 수2 : 12
        // 최대공약수 : 6

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int su1 = sc.nextInt();
        System.out.print("수2 : ");
        int su2 = sc.nextInt();

        int max = 0;

        for (int i = 1; i <= su1; i++) {

            for (int j = 1; j <= su2; j++) {

                if (su1 % i == 0 && su2 % j == 0 && i == j) {
                    max = i;
                }

            } // in

        } // out

        System.out.print("최대공약수 : " + max);

        System.out.println("---------------------------------");

        //유클리드 호제법으로 최대공약수 구하기

        while( su2 != 0 ){

            int tmp = su1 % su2;
            su1 = su2;
            su2 = tmp;

        }//while

        System.out.print("최대공약수 : " + su1);

    }// main
}
