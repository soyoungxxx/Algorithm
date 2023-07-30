#include <stdio.h>
#include <stdlib.h>

int main() {
  int N;
  scanf("%d", &N);
  int a = 0, b = 0;

  while(N > 0) {
    if (N % 5 == 0) {
      a = N / 5;
      N = 0;
    }
    else {
      N -= 3;
      b += 1;
    }
  }

  if (N != 0) printf("-1");
  else printf("%d", a+b);
}