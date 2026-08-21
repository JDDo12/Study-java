package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // 문제 : PEALP
        // >> ealpp
        // ealpp 오답
        // >> apple
        // >> apple 정답!!

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] strArr = { "APPLE", "ORANGE", "HOPE", "VIEW" };

        // 배열에서 랜덤으로 하나 선택
        int num = random.nextInt(strArr.length);
        String answer = strArr[num];

        // 글자를 섞기 위해 char 배열로 변환
        char[] arr = answer.toCharArray();

        // 글자 섞기
        for (int i = 0; i < arr.length; i++) {

            int a = random.nextInt(arr.length);
            int b = random.nextInt(arr.length);

            char temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        String quiz = new String(arr);

        System.out.println("문제 : " + quiz);

        // 정답 입력
        while (true) {
            System.out.print(">> ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase(answer)) {
                System.out.println(input + " 정답!!");
                break;
            } else {
                System.out.println(input + " 오답");
            }
        }

    }// main
}
