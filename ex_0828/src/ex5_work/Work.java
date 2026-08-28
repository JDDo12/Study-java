package ex5_work;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {

        /*
         *** HangMan ***
         * Word : ☆☆☆☆☆ >> a
         * Word : a☆☆☆☆ >> a
         * a은(는) 이미 입력한 문자입니다
         * Word : a☆☆☆☆ >> e
         * Word : a☆☆☆e >> o
         * o이(가) 포함되어 있지 않습니다
         * Word : a☆☆☆e >> p
         * Word : app☆e >> abc
         * 한글자의 영 소문자만 입력 가능합니다
         * Word : app☆e >> l
         * apple 정답
         * 7회 만에 정답
         */

        Scanner sc = new Scanner(System.in);

        String answer = "apple";

        char[] word = new char[answer.length()];

        for (int i = 0; i < word.length; i++) {
            word[i] = '☆';
        }

        char[] inputList = new char[26];
        int inputCount = 0;

        int count = 0;

        while (true) {

            System.out.print("Word : ");

            for (int i = 0; i < word.length; i++) {
                System.out.print(word[i]);
            }

            System.out.print(" >> ");

            String input = sc.next();
            count++;

            if (input.length() != 1) {
                System.out.println("한글자의 영 소문자만 입력 가능합니다");
                continue;
            }

            char c = input.charAt(0);

            if (c < 'a' || c > 'z') {
                System.out.println("한글자의 영 소문자만 입력 가능합니다");
                continue;
            }

            boolean already = false;

            for (int i = 0; i < inputCount; i++) {
                if (inputList[i] == c) {
                    already = true;
                }
            }

            if (already) {
                System.out.println(c + "은(는) 이미 입력한 문자입니다");
                continue;
            }

            inputList[inputCount] = c;
            inputCount++;

            boolean found = false;

            for (int i = 0; i < answer.length(); i++) {

                if (answer.charAt(i) == c) {
                    word[i] = c;
                    found = true;
                }
            }

            if (found == false) {
                System.out.println(c + "이(가) 포함되어 있지 않습니다");
            }

            String result = new String(word);

            if (result.equals(answer)) {
                System.out.println(answer + " 정답");
                System.out.println(count + "회 만에 정답");
                break;
            }
        }

    }// main
}
