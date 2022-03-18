#include <stdio.h>

typedef struct{
    int x ,y;
    int w, h;
} Rect;

void print(Rect*r) {
    printf("Quandrado de tamanho (%d, %d) na posicao (%d, %d).\n" ,r->w, r->h, r->x, r->y);
}

void main (void) {
    Rect r1 = {1,1, 10, 10};
    print(&r1);
}