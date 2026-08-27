package ex6_work;

import java.util.ArrayList;
import java.util.List;

public class Ex4_work {
    public static void main(String[] args) {

        /*
         * 다음 숫자를 ArrayList에 저장하세요.
         * 
         * 25, 10, 80, 35, 60
         * 
         * for문을 이용해서 가장 큰 숫자를 찾아 출력하세요.
         */

        List<Integer> list = new ArrayList<Integer>();

        list.add(25);
        list.add(10);
        list.add(80);
        list.add(35);
        list.add(60);

        int max = 0;

        for( int i = 0; i < list.size(); i++ ){

            if( list.get(i) > max ){
                
                max = list.get(i);

            }

        }//for

        System.out.println("가장 큰 값 : " + max);

    }// main
}
