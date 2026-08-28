package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Workmain {
    public static void main(String[] args) {

        /*
         * 아이디를 입력하세요 : aaa
         * 새로운 아이디 생성
         * 0승, 0패, 0무
         * 가위(s) | 바위(r) | 보(p) ? : s
         * 이겼습니다.
         * 1승, 0패, 0무
         * 한판 더?? y | n : n
         * 게임이 종료되었습니다.
         * 기록저장
         * 
         * ----------------------------------------
         * 
         * 
         * 아이디를 입력하세요 : aaa
         * 로드성공
         * 1승, 0패, 0무
         * 가위(s) | 바위(r) | 보(p) ? : p
         */

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("아이디를 입력하세요 : ");
        String id = sc.next();

        String path = "C:/myFile/RSP GAME";

        File folder = new File(path);

        // 폴더가 없으면 생성
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // 아이디별 파일
        String filePath = path + "/" + id + ".txt";
        File file = new File(filePath);

        int win = 0;
        int lose = 0;
        int draw = 0;

        // 기존 아이디인지 확인
        if (file.exists()) {

            System.out.println("로드성공");

            try {
                FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream ois = new ObjectInputStream(fis);

                win = ois.readInt();
                lose = ois.readInt();
                draw = ois.readInt();

                ois.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("새로운 아이디 생성");
        }

        System.out.println(win + "승, " + lose + "패, " + draw + "무");

        String again = "y";

        while (again.equals("y")) {

            System.out.print("가위(s) | 바위(r) | 보(p) ? : ");
            String user = sc.next();

            // 컴퓨터
            int com = rnd.nextInt(3);

            String computer = "";

            if (com == 0) {
                computer = "s";
            } else if (com == 1) {
                computer = "r";
            } else {
                computer = "p";
            }

            System.out.println("컴퓨터 : " + computer);

            // 승패 판단
            if (user.equals(computer)) {

                System.out.println("비겼습니다.");
                draw++;

            } else if ((user.equals("s") && computer.equals("p")) ||
                    (user.equals("r") && computer.equals("s")) ||
                    (user.equals("p") && computer.equals("r"))) {

                System.out.println("이겼습니다.");
                win++;

            } else {

                System.out.println("졌습니다.");
                lose++;
            }

            System.out.println(win + "승, " + lose + "패, " + draw + "무");

            System.out.print("한판 더?? y | n : ");
            again = sc.next();
        }

        System.out.println("게임이 종료되었습니다.");
        System.out.println("기록저장");

        // 기록 저장
        try {

            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(win);
            oos.writeInt(lose);
            oos.writeInt(draw);

            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();

    }// main
}
