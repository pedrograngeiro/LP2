package figures;

import java.awt.*;

public class Triangle {
    private int xPoints[];
    private int yPoints[];
    private int x, y, z;

    public Triangle (int xPoints, int yPoints) {
        this.xPoints = {this.x, this.y, this.z};
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(this.x,this.y, this.w,this.h);
    }
}