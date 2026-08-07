package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //#연산자는 스캐너의 .next()를 사용하자
        //수1 : 10
        //수2 : 20
        //연산자 : +, -, *
        //10 + 20 = 30

        System.out.print("수1 : ");
        int n1 = sc.nextInt();
        
        System.out.print("수2 : ");
        int n2 = sc.nextInt();
        
        System.out.print("연산자 : ");
        String str = sc.next();

        switch (str) {
            case "+":
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) );
                break;

            case "-":
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2) );
                break;

            case "*":
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2) );
                break;

            case "/":
                System.out.println(n1 + " / " + n2 +  " = " + ((float)n1 / n2) );
                break;

            default:
                System.out.println("연산자오류");
                break;
        }


        

    }
    
}
