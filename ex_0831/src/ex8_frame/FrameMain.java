package ex8_frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class FrameMain {
    public static void main(String[] args) {

        Font font = new Font("맑은 고딕", Font.BOLD, 20);

        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(500, 100, 800, 500);

        Frame Fmini = new Frame();
        Fmini.setLayout(null);
        Fmini.setBounds(650, 250, 400, 250);

        Button btn1 = new Button("네");
        btn1.setBounds(40, 170, 100, 50 );
        Button btn2 = new Button("아니요");
        btn2.setBounds(260, 170, 100, 50 );

        Label lbl = new Label("종료하시겠습니까?");
        lbl.setBounds(110, 70, 300, 50);
        lbl.setFont(font);
        
        Fmini.add(btn1);
        Fmini.add(btn2);
        Fmini.add(lbl);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "네":
                        System.exit(0);
                        break;
                
                    case "아니요":
                        Fmini.setVisible(false);
                        break;
                }//switch
            }

        };

        btn1.addActionListener(al);
        btn2.addActionListener(al);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                Fmini.setVisible(true);

            };
        });

        Fmini.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                Fmini.setVisible(false);

            };
        });

        f.setVisible(true);
        

    }// main
}
