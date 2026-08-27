package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        /*
         * 다음 숫자를 저장하세요.
         * 
         * 10, 20, 30, 40, 50
         * 
         * 사용자에게 숫자를 하나 입력받고, 입력한 숫자를 리스트에서 삭제하세요.
         * 
         * 예:
         * 
         * 숫자 입력: 30
         * 
         * 10
         * 20
         * 40
         * 50
         */

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.print("입력 : ");
        int n = sc.nextInt();
        
        list.remove(Integer.valueOf(n));

        for( int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }//for

    }// main
}
