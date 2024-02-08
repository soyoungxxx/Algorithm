#include <iostream>
#include <string>

using namespace std;

int main() {
    int N;
    cin >> N;
    int cnt = 0;

    for (int i = 1; i <= N; i++) {
        int j;
        for (j = 1; j <= N - i; j++) {
            printf(" ");
        }
        printf("*");
        if (i != 1 && i != N) {
            cnt += 2;
            for (int k = 0; k < cnt; k++) {
                if (k == cnt - 1) {
                    printf("*");
                } else {
                    printf(" ");
                }
            }
        } else if (i == N) {
            for (j; j < N * 2 - 1; j++) {
                printf("*");
            }
        }
        printf("\n");
    }
}