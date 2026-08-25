package ex4_work;

public class ThreadSub extends Thread {

    private int n;

    public ThreadSub(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        for(int i = n; i >= 0; i--){

            try {

                System.out.println(i);
                Thread.sleep(1000);
                
            } catch (Exception e) {
                
            }

        }//for

    }

}
