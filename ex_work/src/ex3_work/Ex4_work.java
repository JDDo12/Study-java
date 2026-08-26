package ex3_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        // 정수 하나를 입력받아서 숫자를 거꾸로 출력하세요.
        // 숫자 입력: 12345
        // 거꾸로: 54321

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();
        

        while ( n > 0 ) {
            
            System.out.print(n % 10);
            n = n / 10;

        }//while

    }//main
}
