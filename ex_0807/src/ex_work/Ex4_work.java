package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1부터 키보드에서 받은 값(n) 까지의 합을 출력하시오
        //-------------------------------------------
        //입력 : 5
        //결과 : 15

        System.out.print("입력 : ");
        int n = sc.nextInt();
        int result = 0;

        for( int i = 1; i <= n; i++ ){

            result += i;

        }//for
        
        System.out.print("결과 : " + result);

    }//main

}//class
