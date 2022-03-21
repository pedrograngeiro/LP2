package figures;

import java.awt.*;

public class Triangle {
    int x;
    int y;

    public Triangle (int num1, int num2) {
        x = num1;
        y = num2;
    }

    public void print () {
        System.out.println("Valor de x = " + x + " Valor de y = " +y);
    }

}