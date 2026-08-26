package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        /*
         * ArrayList<String>을 만들고 사용자에게 이름을 3번 입력받아 저장하세요.
         * 
         * 입력이 끝나면 저장된 이름을 모두 출력하세요.
         * 
         * 힌트:
         * 
         * for문
         * Scanner
         * add()
         */

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        for( int i = 0; i < 3; i++ ){

            System.out.print("이름 : ");

            String name = sc.next();
            list.add(name);

        }//for

        for( int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }//for

    }// main
}
