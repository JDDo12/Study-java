package ex1_multi_for;

public class Ex8_multifor {
    public static void main(String[] args) {
    
        /* 출력하라.
        1 2 3 4 5 6 7 8 9 10
        2 3 4 5 6 7 8 9 10 1
        3 4 5 6 7 8 9 10 1 2
        4 5 6 7 8 9 10 1 2 3
        5 6 7 8 9 10 1 2 3 4
        6 7 8 9 10 1 2 3 4 5
        7 8 9 10 1 2 3 4 5 6
        8 9 10 1 2 3 4 5 6 7
        9 10 1 2 3 4 5 6 7 8
        10 1 2 3 4 5 6 7 8 9
        */

        for( int i = 1; i <= 10; i++ ){

            for( int j = 0; j <= 9; j++ ){

                if( j+i <= 10 ){
                    System.out.printf("%d ", j + i);
                }else {
                    System.out.printf("%d ", j + i - 10);
                }

            }//in

            System.out.println();

        }//out

    }//main

}//class
