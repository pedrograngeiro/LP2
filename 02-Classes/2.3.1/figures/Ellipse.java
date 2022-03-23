package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse {
    private int x, y;
    private int w, h;
    Color corDePreenchimento;

    public Ellipse (int x, int y, int w, int h, Color corDePreenchimento) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.corDePreenchimento = corDePreenchimento;
    }

    public void print () {
        System.out.format("Ellipse de tamanho (%d, %d) na posicao (%d, %d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(corDePreenchimento);
        g2d.draw(new Ellipse2D.Double(this.x, this.y, this.w, this.h));
    }
}
