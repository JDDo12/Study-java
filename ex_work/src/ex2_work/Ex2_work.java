package ex2_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        //정수 2개를 입력받아서 어느 숫자가 더 큰지 출력하세요.
        // 첫 번째 수: 15
        // 두 번째 수: 8

        // 첫 번째 수가 더 큽니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int n1 = sc.nextInt();
        
        System.out.print("수2 : ");
        int n2 = sc.nextInt();

        if( n1 > n2 ){
            System.out.println("첫 번째 수가 더 큽니다");
        }else if( n1 < n2 ){
            System.out.println("두 번째 수가 더 큽니다");
        }else if( n1 == n2 ){
            System.out.println("똑같습니다");
        }

    }//main
}
