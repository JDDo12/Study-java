package ex9_work;

import java.util.Random;

public class WorkSub {
    
    Random rnd = new Random();

    public void Work( int[] lotto ){

        out: for (int i = 0; i < lotto.length;) {

            lotto[i] = rnd.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {

                if (lotto[i] == lotto[j]) {
                    continue out;
                }

            } // in

            //System.out.print(lotto[i] + " ");
            i++;

        } // out

    }

}
