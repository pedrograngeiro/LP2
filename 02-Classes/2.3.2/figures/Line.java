package figures;

import java.awt.*;

public class Line {
    private int x, y;
    private int w, h;
    private Color corDaBorda;
    
    public Line (int x, int y,int w,  int h, Color corDaBorda) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.corDaBorda = corDaBorda;
    }

    public void print () {
        System.out.format("Linha de tamanho (%d, %d) na posicao (%d, %d)\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(corDaBorda);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(this.x, this.y, this.w, this.h);
        
    }
}
