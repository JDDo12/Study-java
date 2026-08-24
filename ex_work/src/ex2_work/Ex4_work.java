package ex2_work;

public class Ex4_work {
    public static void main(String[] args) {
        
        // for문을 사용해서 1부터 100까지의 짝수만 출력하세요.
        // 2
        // 4
        // 6
        // ...
        // 100

        for( int i = 1; i <= 100; i++ ){

            if( i % 2 == 0 ){
                System.out.println(i);
            }

        }//for

    }//main
}
