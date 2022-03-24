import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Figures.*;


class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1;
    Ellipse e1;
    Line l1;
    Triangle[] objTriangles = new Triangle[3];

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(500, 500);
        
        this.r1 = new Rect(50,50, 150, 90, new Color(255, 0, 72), new Color(91, 16, 35));
        this.e1 = new Ellipse(50, 150, 100, 30, new Color(129, 215, 205), new Color(177, 55, 86));
        this.l1 = new Line(150, 320, 50, 320, Color.BLACK);

        objTriangles[0] = new Triangle(206, 50, 126, 200, 200, 300);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
        this.l1.paint(g);
        this.objTriangles[0].paint(g);
    }
}