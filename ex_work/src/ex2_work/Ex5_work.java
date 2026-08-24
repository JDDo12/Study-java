package ex2_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        // 비밀번호를 1234라고 정해놓고, 사용자에게 비밀번호를 입력받으세요.

        // 비밀번호가 1234이면 → 로그인 성공
        // 틀리면 → 비밀번호가 틀렸습니다.
        // 비밀번호 입력: 1234
        // 로그인 성공

        Scanner sc = new Scanner(System.in);
        int password = 1234;
        int n = 0;
        
        while (n != password) {
            System.out.print("비밀번호 : ");
            n = sc.nextInt();
            
            if( n == password ){
                System.out.println("환영합니다");
            }else{
                System.out.println("비밀번호가 틀렸습니다");
            }


        }//while

    }// main
}
