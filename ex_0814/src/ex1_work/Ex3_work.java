package ex1_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        // 키보드에서 아무값이나 입력받는다
        // 입력받은 문자열에 소문자 a의 개수를 출력
        // -----------------------------------
        // 입력 : abcabc
        // a의 개수 : 2

        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        System.out.print("입력 : ");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {
                cnt++;
            }

        }//for

        System.out.println("a의 개수 : " + cnt);

    }// main
}
