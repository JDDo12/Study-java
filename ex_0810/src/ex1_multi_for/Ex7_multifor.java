package ex1_multi_for;

public class Ex7_multifor {
    public static void main(String[] args) {
    
        //구구단 2단부터 9단까지 다 출력
        // 2 * 1 = 2    3 * 1 = 3   4 * 1 = 4 .... 9 * 1 = 9
        //....
        //2 * 9 = 18    3 * 9 = 27 ............... 9 * 9 = 81

        for( int i = 1; i <= 9; i++ ){

            for( int j = 2; j <= 9; j++ ){

                System.out.printf("%d x %d = %d\t", j, i, (j*i));
                
            }//in

            System.out.println();

        }//out

    }//main

}//class
