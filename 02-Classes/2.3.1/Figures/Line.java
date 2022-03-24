package Figures;

import java.awt.*;

public class Line {
    private int x, y;
    private int w, h;
    Color corDaLinha;
    
    public Line (int x, int y,int w,  int h, Color corDaLinha) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.corDaLinha = corDaLinha;
    }

    public void print () {
        System.out.format("Linha de tamanho (%d, %d) na posicao (%d, %d)\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(corDaLinha);
        g2d.drawLine(this.x, this.y, this.w, this.h);
        
    }
}
