package ex3_listener;

import java.awt.event.WindowListener;

public class MyEvent implements WindowListener {
    @Override
    public void windowOpened(java.awt.event.WindowEvent e) {
        // 이벤트 핸들러 - 창이 열릴 때
    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {
        // 이벤트 핸들러 - 창을 닫을 때
        System.exit(0);
    }

    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {
        // 이벤트 핸들러 - 창이 닫힌 후
    }

    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {
        // 이벤트 핸들러 - 창이 아이콘화(최소화) 될 때
    }

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {
        // 이벤트 핸들러 - 창이 아이콘이 해제(복원) 될 때
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) {
        // 이벤트 핸들러 - 창이 활성화될 때
    }

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) {
        // 이벤트 핸들러 - 창이 비활성화될 때
    }
}
