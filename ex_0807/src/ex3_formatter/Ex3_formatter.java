package ex3_formatter;

public class Ex3_formatter {
    public static void main(String[] args) {

        // 저의 나이는 20살 입니다
        int age = 20;
        System.out.printf("저의 나이는 %d살 입니다\n", age);

        // 저는 20살 이고, 3층에 살아요

        System.out.printf("저는 %d살이고 %02d층에 살아요\n", 20, 3);

        // 나는 박씨야
        System.out.printf("나는 %c씨야\n", '박');

        // 나는 A형이야
        System.out.printf("나는 %C형이야\n", 'A');

        // 원주율 : 3.141592
        System.out.printf("원주율 : %.2f\n", 3.141592);

        // 저는 홍길동입니다
        System.out.printf("저는 %s입니다\n", "홍길동");

        System.out.printf("%s\t %d\t %d\n", "김윤", 100, 95);
        System.out.printf("%s\t %d\t %d\n", "고길동", 100, 7);

        //오늘 강수량은 15%입니다
        System.out.printf("오늘 강수량은 %d%%입니다\n", 15);

    }// main

    /*
     * formatter의 문법
     * \n : 강제 엔터키
     * %d : 정수만 들어가야함
     * %f : 실수만 들어가야함
     * %.2f : . 뒤에 수 만큼 소수점이 들어감
     * %c : 한글자인 문자가 들어가야함
     * %C : 소문자인 문자를 대문자로 바꿔줌
     * %s : 문자열(앵간한건 다 들어감, 근데 문자열만 넣으면 좋음)이 들어감
     * \t : 글 넓이 정렬
     * %% : %기호를 넣기위해서 %를 입력하고 그 뒤에 %를 한 번 더 입력
     */

}// class
