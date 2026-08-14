package ex_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {

        // 홀수 마방진 만들기
        // 키보드에서 입력받음
        // 홀수 : 3
        // 08 01 06
        // 03 05 07
        // 04 09 02

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 마방진 : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%02d ", arr[i][j]);

            } // in

            System.out.println();

        } // out

    }// main
}
