#include <iostream>
#include <string>

using namespace std;

int main() {
    int N;
    cin >> N;
    for (int i = N; i >= 0; i--) {
        for (int j = 0; j < i; j++) {
            printf("*");
        }
        printf("\n");
    }
}