package ex8_filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex2_BufWriter {
    public static void main(String[] args) {

        String path = "C:/myFile/filewriter예제.txt";
        File f = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < 3; i++) {

                bw.write(i + "번째 라인");
                // 한줄 아래로 이동하는 메서드 \n 이랑 똑같은 거
                bw.newLine();

            } // for

            bw.flush();

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

            try {
                
                if( bw != null ){
                    bw.close();
                }

                if( fw != null ){
                    fw.close();
                }

            } catch (Exception e) {
                // TODO: handle exception
            }

        }

    }// main
}
