import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class PaintAppElipse {
    public static void main(String[] args) {
        PaintFrame2 frame = new PaintFrame2();
        frame.setVisible(true);
    }
}


class PaintFrame2 extends JFrame {

    Elipse e1;

    PaintFrame2() {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.setTitle("Painting Figures");
        this.setSize(400, 400);
        
        this.e1 = new Elipse(50,350,100,250,150,270,200,200);

        
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.e1.Paint(g);
    }
}

class Elipse {
    int x1, y1, x2, y2, x3, y3, x4, y4;

    Elipse(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    void Print () {
        System.out.format("Elipse na cordenada (x: %d, y: %d) (x: %d, y: %d) (x: %d, y: %d) (x: %d, y: %d)\n"
        , this.x1, this.y1, this.x2, this.y2, this.x3, this.y3, this.x4, this.y4);
    }

    void Paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(50, 50, this.x1, this.y1);
        g2d.drawLine(this.x1, this.y1, this.x2, this.y2);
        g2d.drawLine(this.x2, this.y2, this.x3, this.y3);
        g2d.drawLine(this.x3, this.y3, this.x4, this.y4);
        
    }

}