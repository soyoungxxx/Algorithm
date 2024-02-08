#include <iostream>
#include <string>

using namespace std;

int main() {
    int T;
    cin >> T;
    for (int i = 0; i < T; i++) {
        int a, b;
        char tmp;
        scanf("%d%c%d", &a, &tmp, &b);
        printf("%d\n", a + b);
    }
}