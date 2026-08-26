package ex4_work;

import java.util.ArrayList;
import java.util.List;

public class Ex2_work {
    public static void main(String[] args) {

        // ArrayList<Integer>를 만들고 10, 20, 30, 40, 50을 저장하세요.
        // 그 후 3번째 숫자를 출력하세요.
        // 예상 결과:
        // 30

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int res = list.get(2);
        System.out.println(res);

    }// main
}
