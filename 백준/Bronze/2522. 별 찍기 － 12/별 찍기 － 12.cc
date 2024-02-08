#include <iostream>
#include <string>

using namespace std;

int main() {
    int N;
    cin >> N;
    int cnt = 2;

    for (int i = 1; i <= N * 2 - 1; i++) {
        int j = 0;
        int index = i;
        if (index > N) {
            index -= cnt;
            cnt += 2;
        }
        for (j = 1; j <= N - index; j++) {
            printf(" ");
        }
        for (j; j <= N; j++) {
            printf("*");
        }
        printf("\n");
    }
}