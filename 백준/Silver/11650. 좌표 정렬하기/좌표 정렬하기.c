#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Point {
  int x;
  int y;
}point;

int static compare(const void* first, const void* second) {
  point *p1 = (point *) first;
  point *p2 = (point *) second;

  if (p1->x == p2->x) {
    return p1->y - p2->y;
  } else return p1->x - p2->x;
}

int main() {
  int N;
  point *p;
  scanf("%d", &N);
  p = (point*)malloc(sizeof(point)*N);

  for (int i = 0; i < N; i++) {
    int x, y;
    scanf("%d %d", &x, &y);
    p[i].x = x;
    p[i].y = y;
  }
  qsort(p, N, sizeof(point), compare);

  for (int i = 0; i < N; i++) {
    printf("%d %d\n", p[i].x, p[i].y);
  }
}