package ex2_choice;

import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class ChoiceMain {
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.setBounds(500, 300, 500, 300);
        f.setLayout(null);

        Label lb = new Label();
        lb.setBounds(170, 130, 250, 100);
        
        Choice cho = new Choice();
        cho.add("지역선택");
        cho.add("서울");
        cho.add("경기");
        cho.add("인천");
        cho.add("광주");
        cho.add("대구");
        cho.add("대전");
        cho.add("부산");
        cho.setBounds(50, 130, 100, 100);

        cho.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(java.awt.event.ItemEvent e) {
            String str = cho.getSelectedItem();
            lb.setText(str + "을(를) 선택했습니다");
        }

        });

        f.add(cho);
        f.add(lb);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);

            };
        });

    }//main
}
