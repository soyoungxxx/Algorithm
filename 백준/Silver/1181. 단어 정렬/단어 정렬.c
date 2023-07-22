#pragma warning(disable:4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// void Quicksort(char** word, int left, int right);
void Heapify(char** word, int i, int N);
void Heapsort(char** word, int N);
void swap(char* A, char* B);
void print(char** word, int N);

int main() {
    int N, cnt = 0;
    scanf("%d", &N);
    char** word;
    word = (char**)malloc(sizeof(char*) * N);

    for (int i = 0; i < N; i++) {
        getchar();
        word[i] = (char*)malloc(sizeof(char) * 51);
        scanf("%s", word[i]);
    }

//  Quicksort(word, 0, N);
    Heapsort(word, N);
    print(word, N);

    return 0;
}

// A 길이가 짧으면 1
// 길이가 같고, A가 사전순으로 먼저면 1
int compare(char* A, char* B) {
    if (strlen(A) < strlen(B)) return 1;
    else if (strlen(A) == strlen(B)) {
        if (strcmp(A, B) < 0) return 1;
    }
    return 0;
}

// 문자열 교환
void swap(char* A, char* B) {
    char tmp[51];
    strcpy(tmp, A);
    strcpy(A, B);
    strcpy(B, tmp);
}

void Heapify(char** word, int i, int N) {
    int child1 = i * 2 + 1;
    if (child1 >= N) return;

    if (child1 + 1 < N && compare(word[child1], word[child1 + 1])) ++child1;
    if (compare(word[child1], word[i])) return;

    swap(word[i], word[child1]);
    Heapify(word, child1, N);
}


void Heapsort(char** word, int N) {
    for (int i = N / 2 - 1; i >= 0; i--) {
        Heapify(word, i, N);
    }

    for (int i = N - 1; i > 0; i--) {
        swap(word[0], word[i]);
        Heapify(word, 0, i);
    }
}


/*
// 퀵정렬 알고리즘
void Quicksort(char** word, int left, int right) {
    if (right - left <= 1) return;
    int pivotIndex = (left + right) / 2;

    // 피봇 저장
    char pivot[51];
    strcpy(pivot, word[pivotIndex]);

    // 오른쪽 끝으로 pivot 보내기
    swap(word[right - 1], word[pivotIndex]);

    // 맨 왼쪽부터 pivot까지 비교하면서 정렬
    int i = left;
    for (int j = left; j < right - 1; j++) {
        if (len(word[j], pivot) == 1) {
            swap(word[i++], word[j]);
        }
        else if (len(word[j], pivot) == 2) {
            if (dic(word[j], pivot) == 1) {
                swap(word[i++], word[j]);
            }
        }
    }
    swap(word[i], word[right - 1]);

    Quicksort(word, left, i);
    Quicksort(word, i + 1, right);

}
퀵 정렬을 사용하여 구현했지만 최악 시간 때문에 시간 초과, 힙 정렬로 구현해보기로 함
*/

void print(char** word, int N) {
    for (int i = 0; i < N; i++) {
        if (i + 1 != N) {
            if (strcmp(word[i], word[i + 1]) == 0) continue;
        }
        printf("%s\n", word[i]);
    }
}