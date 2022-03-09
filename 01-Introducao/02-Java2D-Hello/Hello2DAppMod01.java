import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DAppMod01 {
    public static void main (String[] args) {
        Hello2DFrameMod01 frame = new Hello2DFrameMod01();
        frame.setVisible(true);
    }
}

class Hello2DFrameMod01 extends JFrame {
    private static final long serialVersionUID = 1L;

    public Hello2DFrameMod01 () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int userWidth = gd.getDisplayMode().getWidth();
        int userHeight = gd.getDisplayMode().getHeight();

        this.setSize(userWidth, userHeight);
    }

    public void paint (Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();

        //Cor de fundo
        g.setColor(Color.black);
        g.fillRect(0, 0, w, h);

        //Linha Cruzada
        g2d.setPaint (new Color(126,112,183)); 
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0, 0, w, h);
        g2d.drawLine(0, h, w, 0);

        //Quadrado sem fundo
        int tamanhoQuadrado = 600;
        g2d.setPaint(Color.white);
        g2d.drawRect(w/2 - tamanhoQuadrado/2, h/2 - tamanhoQuadrado/2, tamanhoQuadrado, tamanhoQuadrado);

        //Quadrado agora com fundo
        g2d.setPaint(Color.white);
        g2d.fillRect(w/2 - tamanhoQuadrado/2, h/2 - tamanhoQuadrado/2, tamanhoQuadrado, tamanhoQuadrado);

        //Circulo sem fundo
        g2d.setPaint(Color.red);
        g2d.drawArc(w/2 - tamanhoQuadrado/2, h/2 - tamanhoQuadrado/2, tamanhoQuadrado, tamanhoQuadrado, 0, 360);


        //Ciruclo agora com fundo
        g2d.setPaint(Color.red);
        g2d.fillArc(w/2 - tamanhoQuadrado/2, h/2 - tamanhoQuadrado/2, tamanhoQuadrado, tamanhoQuadrado, 0, 360);
    }
}