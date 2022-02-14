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

        g.setColor(Color.black);
        g.fillRect(0, 0, w, h);
        //Cor da linha
        g2d.setPaint (new Color(126,112,183)); 
        
        //Stroke
        g2d.setStroke(new BasicStroke(5));

        

        g2d.drawLine(0, 0, w, h);
        g2d.drawLine(0, h, w, 0);
    }
}