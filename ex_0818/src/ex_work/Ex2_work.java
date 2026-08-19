package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 키보드에서 입력
        // 검색 : 조인성
        // [조인성]
        // 모가디슈
        // 호프

        // 검색 : aaa
        // 해당 배우의 정보가 없습니다.

        String[][] actor = { { "[송강호]", "박쥐", "괴물", "관상" },
                             { "[조인성]", "모가디슈", "호프" },
                             { "[이병헌]", "레드", "광해", "놈놈놈" } };

        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("검색 : ");
        String name = sc.next();

        Ex2_sub sub = new Ex2_sub();
        sub.findActor(actor, name, cnt);

        // for (int i = 0; i < actor.length; i++) {

        //     if (actor[i][0].equals("[" + name + "]")) {

        //         for (int j = 0; j < actor[i].length; j++) {
        //             System.out.println(actor[i][j]);
        //         } // in

        //     } else {

        //         cnt++;

        //         if (cnt == actor.length) {
        //             System.out.println("배우정보가 없음");
        //         }

        //     }

        // } // out

    }// main
}
