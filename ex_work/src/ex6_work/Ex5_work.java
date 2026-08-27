package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        /*
         * 사용자에게 이름을 3개 입력받아 ArrayList에 저장하세요.
         * 
         * 그 후 검색할 이름을 하나 입력받아서, 리스트에 그 이름이 있는지 확인하세요.
         * 
         * 예:
         * 
         * 이름 입력: 철수
         * 이름 입력: 영희
         * 이름 입력: 민수
         * 
         * 검색할 이름: 영희
         * 
         * 영희가 있습니다.
         * 
         * 없다면:
         * 
         * 검색할 이름: 지수
         * 
         * 지수가 없습니다.
         */

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();



        while (list.size() < 3) {
        
            System.out.print("이름 입력 : ");
            String name = sc.next();
            list.add(name);
            
        }//while

        System.out.print("검색할 이름 : ");
        String find = sc.next();

        if( list.contains(find) ){
            System.out.printf("%s가 있습니다\n", find);
        } else {
            System.out.printf("%s가 없습니다\n", find);
        }

    }// main
}
