package ex1_string;

public class Ex2_String {
    public static void main(String[] args) {

        //length만 1번부터 시작
        //length를 제외한 것들은 무조건 0번부터 시작
        String str = "Hong Gil Dong";
        int index = str.length(); //★★★
        System.out.println("str의 길이 : " + index);

        index = str.indexOf('o');
        System.out.println("맨 처음 문자 o의 위치  : " + index);

        index = str.indexOf("Gil");
        System.out.println("문자열 Gil의 위치 : " + index);

        index = str.lastIndexOf('o');
        System.out.println("마지막 문자 o의 위치 : " + index);

        char res = str.charAt(6);
        System.out.println("6번째 문자 : " + res);

        String ss = str.substring(1, 6);
        System.out.println("잘라낸 문장 : " + ss);

        //equals는 대소문자까지 동일해야만 같은 값으로 인정
        String apple = "apple";//★★★
        if( apple.equals( "apple" ) ){
            System.out.println("사과");
        }

        if( apple.equalsIgnoreCase("apple") ){//★★★
            System.out.println("대소문자 상관없이 사과");
        }

        //.trim은 앞과 뒤의 공백은 다 지워버림 (중간에 넣은 공백은 유지)
        String password = " 1234";//★★★
        String pwd2 = password.trim();
        System.out.println(pwd2 + "의 길이 : " + pwd2.length());

        //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드
        String number = "100";//★★★★★
        int num = Integer.parseInt(number);
        System.out.println(num + 1);

        //기본자료형의 (부모같은느낌) wrapper클래스
        //boolean -> Boolean
        //char -> Character
        //byte -> Byte
        //short -> Short
        //int -> Integer
        //long -> Long
        //float -> Float
        //double -> Double

    }// main
}
