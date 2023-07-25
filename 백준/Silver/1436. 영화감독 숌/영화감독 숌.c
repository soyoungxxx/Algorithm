#include <stdio.h>
#include <stdlib.h>

int main() {
  int N;
  scanf("%d", &N); // N은 10,000보다 작거나 같은 자연수

  int i = 665, cnt = 0, flag = 0;

  while(cnt != N) {
    i++;
    int sixcnt = 0, cpy = i;
    while(cpy > 0) {
      int tmp = cpy % 10;
      if (tmp == 6) {
        sixcnt++;
        flag = 1;
        if(sixcnt == 3) break;
      }
      else {
        sixcnt = 0;
        flag = 0;
      }
      cpy /= 10;
    }
    if (sixcnt >= 3) cnt++;
    flag = 0;
  }

  printf("%d", i);
}