package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 비교값으로 1 ~ 12월 사이의 값을 키보드에서 입력을 받아라
        // 준비된 비교값에 해당하는 달이 몇일까지 있는지 출력
        // ---------------
        // 3월은 31일 까지 있습니다

        System.out.print("월 : ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "월은 31일까지");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 30일까지");
                break;

            case 2:
                System.out.println(month + "2월은 28일까지");
                break;

        }

    }// main

}// class
