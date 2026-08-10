package ex1_multi_for;

public class Ex1_multifor {
    public static void main(String[] args) {

        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        for (int i = 1; i <= 3; i++) { // y축

            for (int j = 1; j <= 5; j++) { // x축

                System.out.printf("%d ", j);

            } // infor

            System.out.println();

        } // outfor

        System.out.println("--------------------------------------------");

        // 5 4 3 2 1
        // 5 4 3 2 1
        // 5 4 3 2 1

        for (int n1 = 1; n1 <= 3; n1++) {

            for (int n2 = 5; n2 >= 1; n2--) {

                System.out.printf("%d ", n2);

            } // infor

            System.out.println();

        } // outfor

    }// main

}// class