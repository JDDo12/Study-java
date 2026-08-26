package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1_work {
    public static void main(String[] args) {

        // Arratlist arr에 1 ~ 30사이의 난수를 5개 추가
        // arr에 담겨진 값중 가장 큰 값 출력
        // -----------------------------------------
        // [16, 13, 29, 29, 14]
        // 가장 큰 값 : 29

        Random r = new Random();
        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {

            int rnd = r.nextInt(30) + 1;
            arr.add(rnd);

        } // for

        System.out.println(arr);
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {

            if (arr.get(i) > max) {

                max = arr.get(i);

            }

        } // for

        System.out.println("가장 큰 값 : " + max);

    }// main
}
