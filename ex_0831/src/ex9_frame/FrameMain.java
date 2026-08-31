package ex9_frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class FrameMain {

    static int su1 = 0;
    static int su2 = 0;
    static String op = "";

    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(null);
        f.setBounds(900, 200, 350, 500);

        Font font = new Font("맑은 고딕", Font.BOLD, 20);

        Button num0 = new Button("0");
        Button num1 = new Button("1");
        Button num2 = new Button("2");
        Button num3 = new Button("3");
        Button num4 = new Button("4");
        Button num5 = new Button("5");
        Button num6 = new Button("6");
        Button num7 = new Button("7");
        Button num8 = new Button("8");
        Button num9 = new Button("9");
        Button c = new Button("c");
        Button d = new Button("/");
        Button t = new Button("*");
        Button m = new Button("-");
        Button p = new Button("+");
        Button e = new Button("=");

        num0.setBounds(20, 400, 220, 70);
        num1.setBounds(20, 325, 70, 70);
        num2.setBounds(95, 325, 70, 70);
        num3.setBounds(170, 325, 70, 70);
        num4.setBounds(20, 250, 70, 70);
        num5.setBounds(95, 250, 70, 70);
        num6.setBounds(170, 250, 70, 70);
        num7.setBounds(20, 175, 70, 70);
        num8.setBounds(95, 175, 70, 70);
        num9.setBounds(170, 175, 70, 70);
        c.setBounds(170, 100, 70, 70);
        d.setBounds(250, 400, 70, 70);
        t.setBounds(250, 325, 70, 70);
        m.setBounds(250, 250, 70, 70);
        p.setBounds(250, 175, 70, 70);
        e.setBounds(250, 100, 70, 70);

        TextField tf = new TextField();
        tf.setBounds(20, 30, 300, 50);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                switch (e.getActionCommand()) {

                    case "+":
                        su1 = Integer.parseInt(tf.getText());
                        op = "+";
                        break;
                    case "-":

                        break;
                    case "*":

                        break;
                    case "/":

                        break;
                    case "=":
                        int index = tf.getText().indexOf(op);
                        su2 = Integer.parseInt(tf.getText().substring(index + 1));
                        switch(op){
                            case "+": 
                            tf.setText(String.valueOf(su1 + su2));
                            break;
                        }//switch
                        break;
                    case "c":

                        break;
                    default:
                        tf.setText(tf.getText() + e.getActionCommand());
                        break;

                }// switch

            }

        };

        f.add(num0);
        f.add(num1);
        f.add(num2);
        f.add(num3);
        f.add(num4);
        f.add(num5);
        f.add(num6);
        f.add(num7);
        f.add(num8);
        f.add(num9);
        f.add(c);
        f.add(d);
        f.add(t);
        f.add(m);
        f.add(p);
        f.add(e);
        f.add(tf);

        num0.addActionListener(al);
        num1.addActionListener(al);
        num2.addActionListener(al);
        num3.addActionListener(al);
        num4.addActionListener(al);
        num5.addActionListener(al);
        num6.addActionListener(al);
        num7.addActionListener(al);
        num8.addActionListener(al);
        num9.addActionListener(al);
        c.addActionListener(al);
        d.addActionListener(al);
        t.addActionListener(al);
        m.addActionListener(al);
        p.addActionListener(al);
        e.addActionListener(al);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);

            };
        });

        f.setVisible(true);

    }// main
}
