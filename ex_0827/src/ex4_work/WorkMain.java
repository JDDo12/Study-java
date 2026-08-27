package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {

        // C:/myFile/work3.txt에서
        // 사용자가 입력받은 값의 출현 빈도를 출력
        // ----------------------------------
        // 입력 : 홍
        // 홍의 출현 횟수는 : 4

        Scanner sc = new Scanner(System.in);
        String path = "C:/myFile/work3.txt";
        File f = new File(path);
        byte[] console = new byte[(int)f.length()];
        FileInputStream fis = null;
        
        System.out.print("입력 : ");
        String input = sc.next();
        String str = "";
        int cnt = 0;

        try {
            
            fis = new FileInputStream(f);

            fis.read(console);
            str = new String(console).trim();

            for( int i = 0; i < str.length(); i++ ){

                if( input.equals(String.valueOf(str.charAt(i))) ){
                    cnt++;
                }

            }//for

            System.out.println("결과 : " + cnt);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {

            try {
                
                if( fis != null ){
                    fis.close();
                }

            } catch (Exception e) {
                // TODO: handle exception
            }

        }

    }// main
}
