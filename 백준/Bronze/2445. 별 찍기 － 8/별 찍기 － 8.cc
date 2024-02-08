#include <iostream>
#include <string>

using namespace std;

int main() {
    int N;
    int index = 0, cnt = 2;
    cin >> N;
    for (int i = 1; i <= 2 * N - 1; i++) {
        int j = 0;
        index = i;
        if (index > N) {
            index -= cnt;
            cnt += 2;
        }
        for (j = 0; j < index; j++) {
            printf("*");
        }
        for (j = j - 1; j < (2 * N - 1) - index; j++) {
            printf(" ");
        }
        for (j; j < 2 * N - 1; j++) {
            printf("*");
        }
        printf("\n");
    }
}