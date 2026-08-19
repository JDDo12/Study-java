package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
    public static void main(String[] args) {

        // 1 ~ 50사이의 난수를 발생시키고
        //키보드에서 입력받은 정수를 난수와 비교하기
        //------------------------------------
        //정답 : 25
        //정수 : 30
        //DOWN
        //정수 : 20
        //UP
        //정수 : 25
        //3회 만에 정답~!

       // Scanner sc = new Scanner(System.in);
        
        int answer = new Random().nextInt(50) + 1;
        int num = 0;
        int cnt = 0;


        UpdownSub um = new UpdownSub();
        um.UpdownSS(num, cnt, answer);

    }// main
}
