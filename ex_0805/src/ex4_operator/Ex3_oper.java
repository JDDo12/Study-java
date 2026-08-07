package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {
        
        //논리연산자
        //비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
        int age = 30;
        int limit = 35;

        //&&(and)연산자
        //앞 연산이 거직이면 뒤 연산을 수행하지 않는다.
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false
        boolean res = (limit - age) > 5 && (age += 2) > 30;
        System.out.println("&&연산 : " + res);
        System.out.println("age : " + age);

        //||(or) 연산자
        int i1 = 10;
        int i2= 20;
        res = (i1 += 10) > 20 || i2 - 10 == 11;
       
        System.out.println("res:" + res);
        System.out.println("res:" + !res);
        System.out.println("res:" + res);
    }
}
