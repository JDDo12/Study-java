package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex09_work {
    public static void main(String[] args) {
        /*중복되지 않은 3자리 수 
        세자리 수를 입력하세요(예:123) - 123
        1Strike, 1Ball
        --------------------------
        세자리 수를 입력하세요(예:123) - 567
        OUT!!
        --------------------------
        세자리 수를 입력하세요(예:123) - 214
        0Strike, 3Ball
        --------------------------
        세자리 수를 입력하세요(예:123) - 142
        4회 정답 !! - 142
        */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 0;
        int j = 0;

        int[] base = new int[3];

        
        out : for( i = 0; i < base.length;){

            base[i] = new Random().nextInt(9) + 1;

            for( j = 0; j < i; j++ ){

                if( base[i] == base[j] ){
                    continue out;
                }//if
  
            }//in
            
            System.out.print(base[i] + "");
            i++;
            
        }//out
        

        
    }// main
}
