package ex6_work;

import java.util.Scanner;

public class WorkSub {

    public void work() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 2;

        for (; i <= n; i++) {

            if (n % i == 0) {
                break;
            }

        } // for

        if (i == n) {

            System.out.printf("%d은(는) 소수입니다\n", n);

        } else {

            System.out.printf("%d은(는) 소수가 아닙니다\n", n);
            
        }

    }

}
