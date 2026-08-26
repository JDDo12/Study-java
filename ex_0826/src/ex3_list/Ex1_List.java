package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(100);
        list.add(50);
        // index를 중간에 끼워넣고 뒤에 있던 index들은 밀려나면서 번호가 바뀜
        list.add(1, 60);
        // 기존에 있던 index값을 수정할 수 있음
        list.set(0, 90);
        // 특정 index를 삭제할 수 있음
        // 중간에 있는 index를 삭제할 시, 뒤에 있던 index들이 알아서 앞으로 당겨짐
        list.remove(2);

        if( list.contains(50) ){
            System.out.println("list에 50이 있다");
        }
        
        System.out.println("size : " + list.size());
        System.out.println(list);
        System.out.println("2번 index값 : " + list.get(2));

        list.clear();
        System.out.println("size : " + list.size());

    }//main
}
