package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        /*
         * 다음 숫자를 ArrayList에 저장하세요.
         * 10, 20, 30, 40, 50
         * 사용자에게 숫자 하나를 입력받고, 그 숫자가 ArrayList에 있는지 확인하세요.
         * 예:
         * 숫자 입력: 30
         * 30이 있습니다.
         */

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();

        if( list.contains(n) ){
            System.out.println("있습니다");
        } else {
            System.out.println("없습니다");
        }

    }// main
}
