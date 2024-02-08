#include <iostream>
#include <string>

using namespace std;

int main() {
    int N;
    cin >> N;
    int cnt = 0;
    int line = N * 2 - 1;

    for (int i = 1; i <= line; i++) {
        int j = 0;
        int index = i;
        if (index >= N) {
            index -= cnt;
            cnt += 2;
        }
        for (j = 1; j < index; j++) {
            printf(" ");
        }
        for (j = index; j <= line - index + 1; j++) {
            printf("*");
        }
        printf("\n");
    }
}