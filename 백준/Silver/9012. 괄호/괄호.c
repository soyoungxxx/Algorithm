#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
  char *stack;
  int N;

  scanf("%d", &N);

  for(int i = 0; i < N; i++) {
    char tmp[51];
    int cnt = 0;
    scanf("%s", tmp);
    if (strlen(tmp) % 2 != 0) printf("NO\n");
    else {
      for (int j = 0; j < strlen(tmp); j++) {
        if (tmp[j] == '(') cnt++;
        else cnt--;
        if (cnt < 0) break;
      }
      if(cnt == 0) printf("YES\n");
      else printf("NO\n");
    }
  }
}