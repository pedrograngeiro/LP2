#include <stdio.h>

typedef struct{
    int x ,y;
    int w, h;
} Elipse;

void print(Elipse*e) {
    printf("Quadrado de tamanho (%d, %d) na posicao (%d, %d).\n" ,e->w, e->h, e->x, e->y);
}

void main (void) {
    Elipse e1 = {1,1, 10, 10};
    print(&e1);
}