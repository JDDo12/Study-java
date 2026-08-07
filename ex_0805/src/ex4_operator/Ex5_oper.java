package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {
        //삼항연산자
        //조건연산자
        //하나의 조건식을 통해 발생하는 결과를 원하는 타입으로 반환 할 수 있도록 하는 연산자

        int a = 10;
        int b = 15;
        int c = ++a >= b ? 100 : 200;

        System.out.println(c);

        int n1 =10;
        int n2 = 20;
        float f1 = (n1 += n1) == n2 ? 3.14f : 5.19f;

        System.out.println(f1);

        a = 10;
        b = 12;

        char cv = ++a >= b || (a - 8) + 7 <= b && 13 - b >= 0 && (a+=b) - (a%b) > 10 ? 'O' : 'X';

        System.out.println(cv);
    }
}
