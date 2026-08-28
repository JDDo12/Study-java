package ex3_work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WorkMain {
    public static void main(String[] args) {
        
        // 1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        // -----------------------------------------
        
        List<Integer> lotto = new ArrayList<Integer>();
        Random rnd = new Random();
        
        while( lotto.size() < 6 ){

        int n = rnd.nextInt(45) + 1;

        if( lotto.contains(n) != true ){
            lotto.add(n);
        }

    }//while

    Collections.sort(lotto);

    for( int i = 0; i < lotto.size(); i++ ){

        System.out.print(lotto.get(i) + " ");
        
    }//for

    }// main
}
