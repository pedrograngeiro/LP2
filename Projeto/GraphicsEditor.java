import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

import figures.*;


class GraphicsEditor {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame implements MouseListener {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();

    JLabel label;

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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Graphics Editor");
        this.setSize(350, 350);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 50, 50);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);

    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("Voce clicou");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("Voce segurou o click");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("Voce Soltou o click");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("Voce entrou na figura");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("O mouse saiu da figura");
        
    }
}