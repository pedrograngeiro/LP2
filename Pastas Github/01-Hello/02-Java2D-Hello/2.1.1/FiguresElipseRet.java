public class FiguresElipseRet {
    public static void main (String[] args){
        Elipse e1 = new Elipse(5,35,10,25,15,27,20,20);
        e1.print();
        Rectangle r1 = new Rectangle(2, 2, 8, 10);
        r1.print();
    }
}

class Elipse{
    int x1, x2, x3, x4;
    int y1, y2, y3, y4;

    Elipse (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
    void print () {
        System.out.format("Elipse na cordenada (x: %d, y: %d) (x: %d, y: %d) (x: %d, y: %d) (x: %d, y: %d)\n"
        , this.x1, this.y1, this.x2, this.y2, this.x3, this.y3, this.x4, this.y4);
    }
}

class Rectangle {
    int x1, x2;
    int y1, y2;

    Rectangle (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    void print() {
        System.out.format("Rentagulo na cordenada (x: %d, y: %d) (x: %d, y: %d)\n"
        , this.x1, this.y1, this. x2, this.y2);
    }
}