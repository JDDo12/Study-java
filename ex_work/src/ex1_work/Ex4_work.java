package ex1_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 정수 하나를 입력받아서 해당 숫자의 구구단을 출력하세요.
        // 몇 단? 3

        // 3 x 1 = 3
        // 3 x 2 = 6
        // ...
        // 3 x 9 = 27

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단? : ");
        int n = sc.nextInt();

        for( int i = 1; i <= 9; i++ ){
            
            System.out.printf("%d X %d = %d\n", n, i, (n*i));

        }//for

    }// main
}
