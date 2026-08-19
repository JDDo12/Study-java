package ex7_work;

import java.util.Scanner;

public class UpdownSub {
    Scanner sc = new Scanner(System.in);
    
    public void UpdownSS( int num, int cnt, int answer ){

        while ( num != answer ) {
            
            cnt++;
            System.out.print("입력 : ");
            num = sc.nextInt();

            if( num < answer ){
                System.out.println("UP");
            }else if( num > answer ){
                System.out.println("DOWN");
            }else{
                System.out.println(cnt + "회 만에 정답~!");
            }

        }//while 

    }//UpdownSub()

}
