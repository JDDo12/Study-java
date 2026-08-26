package ex5_work;

import java.util.ArrayList;
import java.util.List;

public class Ex2_work {
    public static void main(String[] args) {

        /*
         * 다음 과일을 ArrayList<String>에 저장하세요.
         * 
         * 사과
         * 바나나
         * 포도
         * 
         * 그 후 첫 번째 과일을 "수박"으로 변경하고 전체를 출력하세요.
         */

        List<String> list = new ArrayList<String>();

        list.add("사과");
        list.add("바나나");
        list.add("포도");

        list.set(0, "수박");

        System.out.println(list);

    }// main
}
