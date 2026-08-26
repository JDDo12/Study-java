package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {

        // id : aaa
        // aaa 회원
        // id : bbb
        // aaa 회원
        // bbb 회원
        // id : ccc
        // aaa 회원
        // bbb 회원
        // ccc 회원
        // aaa 회원은 이미 존재함

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        out: while (true) {

            System.out.print("id : ");
            String id = sc.next();

            // 중복체크 2
            for( int i = 0; i < list.size(); i++ ){

                if( id.equals(list.get(i)) ){
                    System.out.println(id + "회원은(는) 이미 존재하는 회원입니다");
                    continue out;
                }

            }//for

            // 중복체크 1
            // if( list.contains(id) ){
            // System.out.println(id + "회원은(는) 이미 존재하는 회원입니다");
            // continue;
            // }

            list.add(id);

            // 전체 회원
            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i) + " 회원");

            } // for

        } // while

    }// main
}
