public class FiguresRect {
    public static void main (String[] args){
        Rect r1 = new Rect(2, 2, 8, 6);
        r1.print();
    }
}

class Rect{
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    void print () {
        System.out.format("Retangulo inciando na cordenada (%d, %d) de tamanho Largura:(%d) e Altura:(%d) de altura e terminando na posicao (%d, %d).\n"
        , this.x, this.y, this.w, this.h, this.w + this.x, this.h + this.y);
    }
}
