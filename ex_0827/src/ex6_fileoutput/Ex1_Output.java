package ex6_fileoutput;

import java.io.File;
import java.io.FileOutputStream;

public class Ex1_Output {
    public static void main(String[] args) {

        File f = new File("C:/myFile/fileOutput.txt");
        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream(f);

            String msg = "\n여브세여?! 뭐라고??!!! 어쩐다고?!?!?!?!";

            fos.write(msg.getBytes());

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

            try {
                
                if( fos != null ){
                    fos.close();
                }

            } catch (Exception e) {
                // TODO: handle exception
            }

        }

    }// main
}
