package ex4_listener;

import java.awt.event.WindowListener;

public class ListenerClass implements WindowListener{

    @Override
    public void windowOpened(java.awt.event.WindowEvent e) {
        // 창이 열릴 때 동작
    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {
        // 창이 닫힐 때 동작
        System.exit(0);
    }

    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {
        // 창이 닫힌 후 동작
    }

    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {
        // 창이 최소화될 때 동작
    }

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {
        // 창이 최소화에서 복원될 때 동작
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) {
        // 창이 활성화될 때 동작
    }

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) {
        // 창이 비활성화될 때 동작
    }
    
}
