package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        
        //키보드에서 입력받은 값이 회문인지 판단
        //--------------------------------
        //입력 : 스윙스
        //스윙스은(는) 회문입니다

        //입력 : 스윙칩
        //스윙칩은(는) 회문이 아닙니다

        Scanner sc = new Scanner(System.in);
        
        System.out.print("입력 : ");
        String str = sc.next();

        boolean palindrome = true;

        for( int i = 0; i < str.length(); i++ ){

            if( str.charAt(i) != str.charAt(str.length() - 1 - i) ){
                palindrome = false;
                break;
            }//if

        }//for

        if( palindrome == true ){
            System.out.println(str + "은(는) 회문입니다.");
        }else {
            System.err.println(str + "은(는) 회문이 아닙니다.");
        }

    }//main
}
