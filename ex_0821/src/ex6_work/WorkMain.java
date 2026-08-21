package ex6_work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        
        //정수 : 9
        //9은(는) 소수가 아닙니다

        //정수 : 7
        //7은(는) 소수입니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        
        // int n = sc.nextInt();

        // int i = 2;

        // for( ; i <= n; i++ ){

        //     if( n % i == 0 ){
        //         break;
        //     }

        // }//for

        // if( i == n ){
        //     System.out.printf("%d은(는) 소수입니다\n", n);
        // }else{
        //     System.out.printf("%d은(는) 소수가 아닙니다\n", n);
        // }

        WorkSub ws = new WorkSub();
        ws.work();

    }//main
}
