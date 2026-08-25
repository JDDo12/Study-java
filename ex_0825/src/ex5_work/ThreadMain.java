package ex5_work;

public class ThreadMain {
    public static void main(String[] args) {
        
        //배열 arr에 담긴 값의 합을 A스레드가 계산
        //arr에 담긴 값의 곱을 B스레드가 계산해서 출력
        //---------------------------------------
        //합 : 29
        //곱 : 3960

        //곱 : 3960
        //합 : 29
        
        int[] arr = {3, 5, 11, 6, 4};

        ThreadSub1 ts1 = new ThreadSub1(arr);
        ThreadSub2 ts2 = new ThreadSub2(arr);

        ts1.start();
        ts2.start();

    }//main
}
