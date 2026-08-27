package ex6_work;

import java.util.ArrayList;
import java.util.List;

public class Ex1_work {
    public static void main(String[] args) {

        /*
         * ArrayList<Integer>에 다음 숫자를 저장하세요.
         * 
         * 10, 15, 20, 25, 30
         * 
         * 그리고 for문을 이용해서 짝수만 출력하세요.
         * 
         * 결과:
         * 
         * 10
         * 20
         * 30
         */

        List<Integer> num = new ArrayList<Integer>();
        
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);
        num.add(30);

        for( int i = 0; i < num.size(); i++ ){

            if( num.get(i) % 2 == 0 ){
                
                System.out.println(num.get(i));
                
            }

        }//for


    }// main
}
