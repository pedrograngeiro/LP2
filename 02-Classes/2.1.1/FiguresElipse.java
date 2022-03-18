public class FiguresElipse {
    public static void main (String[] args){
        Elipse r1 = new Elipse(2, 2, 8, 6);
        r1.print();
    }
}

class Elipse{
    int x, y;
    int w, h;

    Elipse (int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    void print () {
        System.out.format("Elipse iniando na cordenada (%d, %d) de tamanho Largura:(%d) e Altura:(%d) de altura e terminando na posicao (%d, %d).\n"
        , this.x, this.y, this.w, this.h, this.w + this.x, this.h + this.y);
    }
}
