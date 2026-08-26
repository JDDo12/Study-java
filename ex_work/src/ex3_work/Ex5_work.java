package ex3_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        // 다음 메뉴를 출력하고 사용자가 번호를 선택하게 하세요.

        // 1. 콜라
        // 2. 사이다
        // 3. 커피
        // 4. 종료

        // 1. 콜라
        // 2. 사이다
        // 3. 커피
        // 4. 종료

        // 선택: 2
        // 사이다를 선택했습니다.

        // 1. 콜라
        // 2. 사이다
        // 3. 커피
        // 4. 종료

        // 선택: 4
        // 프로그램을 종료합니다.

        Scanner sc = new Scanner(System.in);
        
        out : while (true) {

            System.out.println("1. 콜라");
            System.out.println("2. 사이다");
            System.out.println("3. 커피");
            System.out.println("4. 종료");
            
            System.out.println("----------");
            System.out.print("입력 : ");
            int n = sc.nextInt();
        
            switch (n) {
                case 1:
                    System.out.println("콜라를 선택");
                    System.out.println("-----");
                    break;
                case 2:
                    System.out.println("사이다를 선택");
                    System.out.println("-----");
                    break;
                case 3:
                    System.out.println("커피를 선택");
                    System.out.println("-----");
                    break;
            
                default:
                    System.out.println("4. 종료");
                    break out;
            }//switch

        }//while

        System.out.println("프로그램을 종료합니다");

    }// main
}
