package ex_work;

import java.util.Random;

public class Ex3_work {
    public static void main(String[] args) {
        
        //A ~ Z사이의 값중 하나를 랜덤으로 출력
        
        //int rnd = new Random().nextInt( 90 - 65 + 1 ) + 65;
        //System.out.println((char)rnd);
        
        int rnd = new Random().nextInt(26) + 'A';
        System.out.println((char)rnd);

    }//main
}//class
