#include <iostream>
#include <vector>

using namespace std;

int main() {
    string S, P;
    int answer = 0;

    cin >> S;
    cin >> P;

    for (int i = 0; i < P.length(); i++) {
        int max = 0;
        for (int j = 0; j < S.length(); j++) {
            int cnt = 0;
            while (j + cnt < S.length()) {
                if (S[j + cnt] == P[i + cnt]) {
                    cnt += 1;
                } else {
                    break;
                }
            }
            if (max < cnt) {
                max = cnt;
            }
        }
        i += max - 1;
        answer += 1;
    }

    cout << answer;
}