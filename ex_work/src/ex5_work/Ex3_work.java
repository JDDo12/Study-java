package ex5_work;

import java.util.ArrayList;
import java.util.List;

public class Ex3_work {
    public static void main(String[] args) {

        /*
         * 다음 숫자를 ArrayList<Integer>에 저장하세요.
         * 
         * 10, 20, 30, 40, 50
         * 
         * 마지막 숫자만 출력하세요.
         * 
         * 힌트: size()와 get()을 같이 사용해보세요.
         */

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int res = list.get(list.size() - 1);
        System.out.println(res);

    }// main
}
