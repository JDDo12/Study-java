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
        
        int num = new Random().nextInt(9) + 0;
        
        int[] gp = new int[0];
        int[] gop = new int[99];
        char ch = '#';
        int cnt = 0;
        
        for( int i = 0; i < gp.length; i++ ){
            
            for( int j = 0; j < num; j++ ){

                

            }//in
            
        }//out
        

    }//main
}
