import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class PaintApp {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}


class PaintFrame extends JFrame {

    Rect background, r1, r2, r3;

    PaintFrame() {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        
        this.background = new Rect(0, 0, 350, 350, Color.GREEN, Color.green);
        this.r1 = new Rect(20, 50, 200, 40, Color.BLACK, Color.ORANGE);
        this.r2 = new Rect(40, 100, 300, 80, Color.RED, Color.BLACK);
        this.r3 = new Rect(50, 200, 20, 100, Color.gray, Color.RED);
        
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.background.Paint(g);
        this.r1.Paint(g);
        this.r2.Paint(g);
        this.r3.Paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    Color corDePreenchimento;
    Color corDeBorda;

    Rect(int x, int y, int w, int h, Color corDeBorda, Color corDePreenchimento) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.corDeBorda = corDeBorda;
        this.corDePreenchimento = corDePreenchimento;
    }
    

    void Print() {
        System.out.format("Retangulo de tamanho(%d, %d) na posicao (%d, %d).\n",
        this.w, this.h, this.x, this.y);
        
    }

    void Paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.corDeBorda);
        g2d.drawRect(this.x, this.y, this.w, this.h);

        g2d.setColor(this.corDePreenchimento);
        g2d.fillRect(this.x, this.y, this.w, this.h);

        g2d.setStroke(new BasicStroke(5));
    }

}