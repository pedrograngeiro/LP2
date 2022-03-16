import figures.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    figures.Line l1;
    figures.Rect r1;
    figures.Ellipse e1;

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(350, 350);
        this.r1 = new Rect(50,50, 100, 30);
        this.e1 = new Ellipse(50, 100, 100, 30);
        this.l1 = new Line(150, 150, 50, 150, Color.BLACK);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
        this.l1.paint(g);
    }
}