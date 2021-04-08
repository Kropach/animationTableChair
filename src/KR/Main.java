package KR;

import javax.swing.*;

public class Main {
    public static int W = 800, H = 800;
    public static void main(String[] args) {
        JFrame w = new JFrame();
        DrawPanel panel = new DrawPanel();
        panel.setBounds(0,0, W,H);
        w.add(panel);
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        w.setSize(W,H);
        w.setVisible(true);
    }
}
