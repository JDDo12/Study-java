package ex1_string;

import java.util.Scanner;

public class Ex1_String {
    public static void main(String[] args) {
        
        //String클래스의 두 가지 특징
        //1) 객체 생성방법이 2가지 ( 암시적 객체 생성방법, 명시적 객체 생성방법 )
        //2) 한 번 생성된 문자열의 내용은 변하지 않는다 (중요한내용)
        //----------------------------------------
        //암시적 객체 생성은 String만 된다
        //명시적 객체 생성은 앞에 new가 붙는다
        //명시적 객체는 heap메모리에 무조건 새로 만든다

        //첫 알파벳이 대문자로 시작된 클래스로 만든 변수는 객체이다.
        String s1 = "abc"; //암시적 객체 생성
        String s2 = "abc";
        String s3 = new String("abc");//명시적 객체 생성
        String s4 = new String("abc");

        //객체들 끼리의 ==(비교)는 안에 들어간 값이 아니라 주소값 비교한다
        if( s1 == s3 ){
            System.out.println("주소가 같습니다");
        }else{
            System.out.println("주소가 다릅니다");
        }

        //String 클래스의 불변의 법칙 (절대 변하지않음)
        String greet = "안녕";
        greet += "하세요";
        System.out.println(greet);

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");
        String op = sc.next();

        //String 타입 객체들의 값 비교가 궁금할땐
        //== 대신 .equals로 비교한다 무조건!
        if( op.equals("+")  ){
            System.out.println("+연산 할게요");
        }

    }//main
}
