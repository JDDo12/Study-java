package ex4_work;

import java.util.ArrayList;
import java.util.List;

public class Ex4_work {
    public static void main(String[] args) {

        /*
         * 다음 숫자를 ArrayList에 저장하세요.
         * 10, 20, 30, 40
         * 그리고 ArrayList에 총 몇 개의 숫자가 들어있는지 출력하세요.
         * 예상 결과:
         * 4
         */

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.size());

    }// main
}
