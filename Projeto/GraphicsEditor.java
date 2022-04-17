import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

import figures.*;
import listeners.ClickListener;


class GraphicsEditor {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    JFrame window = new JFrame("Graphics Editor");
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();

    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    int x = rand.nextInt(350);
                    int y = rand.nextInt(350);
                    int w = rand.nextInt(50);
                    int h = rand.nextInt(50);


                    if (evt.getKeyChar() == 'r') {
                        Rect r = new Rect(x,y, w,h);
                        figs.add(r);
                    } else if (evt.getKeyChar() == 'e') {
                        Ellipse e = new Ellipse(x, y, w, h);
                        figs.add(e);
                    }
                    repaint();
                }
            }
        );

        this.getContentPane().addMouseListener(
            new ClickListener()
        );

        // window.getContentPane().addMouseListener(new ClickListener());
        // window.setSize(350, 350);
        // window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // window.setVisible(true);

        this.setTitle("Graphics Editor");
        this.setSize(350, 350);

    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}