package ex4_work;

import java.util.ArrayList;
import java.util.List;

public class Ex3_work {
    public static void main(String[] args) {

        /*
         * 다음 과일을 ArrayList에 저장하세요.
         * 
         * 사과
         * 바나나
         * 포도
         * 딸기
         * 
         * 그 후 "포도"를 삭제하고 남은 과일들을 출력하세요.
         */

        List<String> list = new ArrayList<String>();
        list.add("사과");
        list.add("바나나");
        list.add("포도");
        list.add("딸기");

        list.remove(2);

        for( int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }//for

    }// main
}
