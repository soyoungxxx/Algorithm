#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void print(int *arr, int N) {
  printf("<");
  int i = 0;
  for(i = 0; i < N - 1; i++) printf("%d, ", arr[i]);
  printf("%d>", arr[i]);
}

int main() {
  int N, K, *arr;
  int cnt = 0, idx = 0;

  scanf("%d %d", &N, &K);

  arr = (int*)malloc(sizeof(int)*N);
  int *p = (int*)malloc(sizeof(int)*N);

  for (int i = 0; i < N; i++) arr[i] = i + 1;

  int i = 0;
  while(idx < N) {
    if (arr[i] != 0) cnt++;
    if (cnt == K) {
      p[idx++] = arr[i];
      arr[i] = 0;
      cnt = 0;
    }

    i++;
    if (i == N) i = 0;
  }

  print(p, N);
  free(arr);
  free(p);  
}