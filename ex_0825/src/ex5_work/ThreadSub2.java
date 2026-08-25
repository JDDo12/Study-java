package ex5_work;

public class ThreadSub2 extends Thread {

    private int[] arr;
    int mul = 1;

    public ThreadSub2(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        } // for

        System.out.println("곱 : " + mul);
    }

}
