package ex5_work;

public class ThreadSub1 extends Thread {

    private int[] arr;
    int sum = 0;

    public ThreadSub1(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        } // for

        System.out.println("합 : " + sum);
    }

}
