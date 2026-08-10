package ex1_multi_for;

public class Ex9_multifor {
    public static void main(String[] args) {
    
        /* 출력하라.
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
        */

        for( int i = 1; i <= 5; i++ ){

            for( int j = 1; j <= i; j++ ){

                System.out.printf("* ");

            }//in

            System.out.println();

        }//out

    }//main

}//class
