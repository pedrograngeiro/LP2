import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;


class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    // Rect r1;
    // Ellipse e1;
    // Line l1;
    Triangle[] objTriangles = new Triangle[2];

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
        objTriangles[0] = new Triangle(5, 10);
        System.out.println("Objeto triangulo 1: ");
        objTriangles[0].print();
        // this.r1 = new Rect(50,50, 100, 30);
        // this.e1 = new Ellipse(50, 100, 100, 30);
        // this.l1 = new Line(150, 150, 50, 150);


    }

    public void paint (Graphics g) {
        super.paint(g);
        // this.r1.paint(g);
        // this.e1.paint(g);
        // this.l1.paint(g);
    }
}