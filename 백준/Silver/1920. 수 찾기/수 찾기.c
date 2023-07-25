#include <stdio.h>
#include <stdlib.h>

void swap(int a, int b) {
  int tmp = a;
  a = b;
  b = tmp;
}

int BS(int * arr, int num, int left, int right) {
  if (right - left < 1) return 0;

  int p = (left + right) / 2;

  if(arr[p] == num) return 1;
  else if (num < arr[p]) BS(arr, num, left, p);
  else BS(arr, num, p+1, right);
}

int static compare(const void* first, const void* second) {
  if (*(int*)first > *(int*)second) return 1;
  else if (*(int*)first < *(int*)second) return -1;
  else return 0;
}

int main() {
  int N, M;
  scanf("%d", &N);
  int *num = (int*)malloc(sizeof(int)*N);
  for(int i = 0; i < N; i++) {
    scanf("%d", &num[i]);
  }
  qsort(num, N, sizeof(int), compare);

  scanf("%d", &M);
  int *res = (int*)malloc(sizeof(int)*M);
  for (int i = 0; i < M; i++) {
    int number = 0;
    scanf("%d", &number);
    res[i] = BS(num, number, 0, N);
  }

  for (int i = 0; i < M; i++) printf("%d\n", res[i]);
}