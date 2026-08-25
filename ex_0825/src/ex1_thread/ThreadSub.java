package ex1_thread;

public class ThreadSub extends Thread {

    // 위에 extends ㅇㅇㅇ(상속을 무조건 받아야 할 수 있음)
    // thread의 기본형태(시작할때 이런 모습으로 시작)
    @Override
    public void run() {
        // 프로세스의 독립적인 수행을 위한 영역(run)

        for (int i = 0; i < 10; i++) {

            // 0.5초간 휴식
            try {

                Thread.sleep(500);

            } catch (Exception e) {

            }

            System.out.println("스레드 실행중");
            
        } // for

    }

}
