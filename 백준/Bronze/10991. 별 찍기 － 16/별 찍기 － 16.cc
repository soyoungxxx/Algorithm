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
        if (i != 1) {
            cnt += 2;
            for (int k = 0; k < cnt; k++) {
                if (k % 2 == 0) {
                    printf(" ");
                } else {
                    printf("*");
                }
            }
        }
        printf("\n");
    }
}