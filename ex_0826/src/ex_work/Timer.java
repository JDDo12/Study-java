package ex_work;

public class Timer extends Thread {

    int time = 0;
    boolean running = true;

    @Override
    public void run() {

        while (running) {

            try {
                Thread.sleep(1000);
                time++;

            } catch (Exception e) {

            }
        }
    }
}
