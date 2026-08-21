package ex9_work;

import java.util.Random;

public class WorkMain {
    public static void main(String[] args) {

        // 1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기

        int[] lotto = new int[6];
        
        // out: for (int i = 0; i < lotto.length;) {

        //     lotto[i] = new Random().nextInt(45) + 1;

        //     for (int j = 0; j < i; j++) {

        //         if (lotto[i] == lotto[j]) {
        //             continue out;
        //         }

        //     } // in

        //     System.out.print(lotto[i] + " ");
        //     i++;

        // } // out

        WorkSub ws = new WorkSub();
        ws.Work(lotto);

        for( int i = 0; i < lotto.length; i++ ){
            System.out.print(lotto[i] + " ");
        }

    }// main
}
