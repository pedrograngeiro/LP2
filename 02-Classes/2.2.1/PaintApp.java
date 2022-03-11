import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect r1, r2, r3, r4;
    
    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        this.getContentPane().setBackground(new Color(237, 5, 118, 93));
        this.r1 = new Rect (50, 50, 100, 30, new Color(247, 5, 244), new Color(237,5, 118));
        this.r2 = new Rect (50, 100, 250, 60, new Color(116, 5, 224) , new Color(169, 5, 224));
        this.r3 = new Rect (150, 200, 150, 60, new Color(116, 5, 247), new Color(48, 5, 237));
        this.r4 = new Rect (30, 280, 300, 60, new Color(48, 5, 237), new Color(116, 5, 247));

        // Mostrando a tela as posições
        this.r1.print();
        this.r2.print();
        this.r3.print();
        this.r4.print();
    }
    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
        this.r4.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    Color corDaBorda;
    Color corDePreenchimento;

    Rect(int x, int y, int w, int h, Color corDaBorda, Color corDePreenchimento) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.corDaBorda = corDaBorda;
        this.corDePreenchimento = corDePreenchimento;
    }


    void print() {
        System.out.format("Retangulo de tamamnho (%d, %d) na posicao (%d, %d).\n",
            this.w, this.h, this.x, this.y);
    } 

    void paint (Graphics g) {
        Graphics g2d = (Graphics2D) g;
        
        g2d.setColor(corDaBorda);
        g2d.drawRect(this.x, this.y , this. w, this.h);
        
        g2d.setColor(corDePreenchimento);
        g2d.fillRect(this.x, this.y, this.w, this.h);
        
        
    }
}