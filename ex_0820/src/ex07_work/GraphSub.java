package ex07_work;

import java.util.Random;

public class GraphSub {

    int[] count = new int[10];

    public void makeRandom() {

        Random r = new Random();

        for (int i = 0; i < 100; i++) {

            int num = r.nextInt(10);

            count[num]++;

        } // for

    }

    public void printGraph(){

        for( int i = 0; i < 10; i++ ){

            System.out.print(i + "의 갯수 : ");

            for( int j = 0; j < count[i]; j++ ){

                System.out.print("#");

            }//in

            System.out.println(" " + count[i]);

        }//out
        
    }

}
