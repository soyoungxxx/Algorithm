#include <iostream>
#include <vector>

using namespace std;

int main() {
    int T;

    cin >> T;

    for (int i = 1; i <= T; i++) {
        int A, B;
        cin >> A >> B;
        printf("Case #%d: %d\n", i, A + B);
    }
    return 0;
}