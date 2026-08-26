package ex5_work;

import java.util.ArrayList;
import java.util.List;

public class Ex5_work {
    public static void main(String[] args) {

        /*
         * 다음 숫자를 ArrayList<Integer>에 저장하세요.
         * 
         * 10, 20, 30, 40, 50
         * 
         * for문을 이용해서 모든 숫자의 합을 구하세요.
         */

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum = 0;

        for( int i = 0; i < list.size(); i++ ){

            sum += list.get(i);

        }//for

        System.out.println("합계 : " + sum);

    }// main
}
