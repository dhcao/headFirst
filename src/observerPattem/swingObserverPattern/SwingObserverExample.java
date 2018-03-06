package observerPattem.swingObserverPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by KEY on 2018/3/6.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample soe = new SwingObserverExample();
        soe.go();
    }

    private void go() {
        frame = new JFrame();
        JButton jb = new JButton("Should i do it?");
        jb.addActionListener(new AngelListener());
        jb.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER,jb);

        //设置frame属性
        //关闭窗体后退出程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //自动适配所有控件大小
        frame.pack();
        frame.setLocationRelativeTo(null);
        //显示窗体
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do not do it , you might regret it!");
        }
    }

    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }

}
