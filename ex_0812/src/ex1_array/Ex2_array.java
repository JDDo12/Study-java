package ex1_array;

public class Ex2_array {
    public static void main(String[] args) {

        // 배열의 선언 + 생성 + 초기화를 한방에!
        // 와! 신난다!
        int[] ar = { 1, 2, 3, 4, 5 };

        // 1 2 3 4 5

        for (int i = 0; i < ar.length; i++) {

            ar[i] = (i + 1) * 100;
            System.out.print(ar[i] + " ");

        } // for

        System.out.println();
        System.out.println("------------------------------");

        // 개선된 루프!
        // 와! 신기하다!
        for (int n : ar) {
            System.out.println(n);
        } // for

    }// main
}
