package ex8_work;

import java.util.Random;

public class WorkSub {
    
    public void Work( int[] coin){

        int money = new Random().nextInt(500) + 1;
        money *= 10;

        System.out.println("금액 : " + money);

        for (int i = 0; i < coin.length; i++) {

            int res = money / coin[i];

            if (res > 0) {
                System.out.printf("%d원 : %d개\n", coin[i], res);
                money %= coin[i];
            } // if

        } // for

    }

}
