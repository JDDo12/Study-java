package ex6_work;

import java.util.ArrayList;
import java.util.List;

public class Ex2_work {
    public static void main(String[] args) {

        /*
        * 다음 숫자를 저장하세요.
        * 
        * 10, 20, 30, 40, 50
        * 
        * 그리고 3번째 숫자를 100으로 변경하세요.
        * 
        * 결과:
        * 
        * 10
        * 20
        * 100
        * 40
        * 50
        */

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.set(2, 100);

        for( int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }//for
        
    }// main
}
