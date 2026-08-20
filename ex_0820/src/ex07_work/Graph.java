package ex07_work;

import java.util.Random;

public class Graph {
    public static void main(String[] args) {
        
        // 0 ~ 9사이의 난수를 100개 발생시키고
        // 각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오
        //-----------------------------------------
        // 0의 개수 : ############ 12
        // 1의 개수 : ####### 7
        //  ....
        // 9의 개수 : ########## 10
    
        // Random r = new Random();

        // int[] count = new int[10];

        // for( int i = 0; i < 100; i++ ){

        //     int num = r.nextInt(10);

        //     count[num]++;

        // }//for

        // for( int i = 0; i < 10; i++ ){

        //     System.out.print(i + "의 갯수 : ");

        //     for( int j = 0; j < count[i]; j++ ){

        //         System.out.print("#");

        //     }//in

        //     System.out.println(" " + count[i]);

        // }//out

        GraphSub rn = new GraphSub();

        rn.makeRandom();

        rn.printGraph();

    }//main
}
