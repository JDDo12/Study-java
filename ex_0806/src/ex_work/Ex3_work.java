package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //키보드에서 나이와 키를 입력을 받는다
        //나이가 15세 이상이거나 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력

        //나이 : 14
        //키 : 140
        //탑승불가

        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("키 : ");
        int h = sc.nextInt();
        String str = "";
        if( age >= 15 || h >= 150){
            str = "탑승가능";
        }else{
            str = "탑승불가";
        }

        System.out.println(str);

    }//main
    
}
