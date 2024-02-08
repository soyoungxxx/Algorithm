#include <iostream>
#include <string>

using namespace std;

int main() {
    int N;
    cin >> N;
    for (int i = 1; i <= N; i++) {
        for (int j = i; j < N; j++) {
            printf(" ");
        }
        for (int j = 0; j < i * 2 - 1; j++) {
            printf("*");
        }
        printf("\n");
    }
}