package KR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class DrawPanel extends JPanel implements ActionListener{
    private ScreenConverter sc;
    private World w;
    private long t;
    private Timer timer;
    public DrawPanel(){
        super();
        sc = new ScreenConverter(0,800,800,800,800,800);
        w = new World(new Table(300, 100,80, 0), new Chair(100, 0, 60, 75));
        t = System.currentTimeMillis();
        timer = new Timer(40, this);
        timer.start();
    }


    @Override
    public void paint(Graphics g){
        BufferedImage bi = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D gr = bi.createGraphics();
        gr.setColor(Color.BLACK);
        gr.fillRect(0,0,bi.getWidth(), bi.getHeight());
        w.draw(gr, sc);
        g.drawImage(bi, 0,0,null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        long nt = System.currentTimeMillis();
        double d = 1;
        w.update((nt-t)*0.01);
        repaint();
        //t = nt;
    }
}
