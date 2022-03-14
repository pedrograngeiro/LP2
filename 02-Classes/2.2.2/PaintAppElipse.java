import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class RectEllipseApp {
    public static void main (String[] args) {
        RectEllipseFrame frame = new RectEllipseFrame();
        frame.setVisible(true);
    }
}

class RectEllipseFrame extends JFrame {
    Rect r1;
    Ellipse e1;

    RectEllipseFrame () {
        this.addWindowListener(
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Rect + Ellipse");
        this.getContentPane().setBackground(new Color(237, 5, 118, 93));
        this.setSize(350, 350);
        this.r1 = new Rect(50,50, 100, 30, new Color(247, 5, 244), new Color(237,5, 118));
        this.e1 = new Ellipse(50,100, 100, 30, new Color(116, 5, 247), new Color(48, 5, 237));

        //Mostrando a posição na tela
        this.r1.print();
        this.e1.print();
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    Color corDaBorda;
    Color corDePreenchimento;

    Rect (int x, int y, int w, int h, Color corDaborda, Color corDePreenchimento) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.corDaBorda = corDaborda;
        this.corDePreenchimento = corDePreenchimento;
    }

    void print() {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics g2d = (Graphics2D) g;

        g2d.setColor(corDaBorda);
        g2d.drawRect(this.x, this.y, this.w, this.h);

        g2d.setColor(corDePreenchimento);
        g2d.fillRect(this.x, this.y, this.w, this.h);
    }
}

class Ellipse {
    int x, y;
    int w, h;
    Color corDaBorda;
    Color corDePreenchimento;

    Ellipse (int x, int y, int w, int h, Color corDaborda, Color corDePreenchimento) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.corDaBorda = corDaborda;
        this.corDePreenchimento = corDePreenchimento;
    }

    void print() {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(corDaBorda);
        g2d.draw(new Ellipse2D.Double(this.x, this.y, this.w, this.h));

        g2d.setColor(corDePreenchimento);
        g2d.fillOval(this.x, this.y, this.w, this.h);
    }
}