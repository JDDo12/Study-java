package ex1_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        //정수 하나를 입력받아서 홀수인지 짝수인지 출력하세요.
        //숫자 입력: 7
        //홀수입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();

        if( n % 2 == 0 ){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }

    }//main
}
