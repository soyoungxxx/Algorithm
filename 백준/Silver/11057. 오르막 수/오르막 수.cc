#include <iostream>
#include <string>
#include <vector>

using namespace std;

int calculate(int num);

int main() {
    int n;
    cin >> n;
    cout << calculate(n);
}

int calculate(int num) {
    int dp[1001][10];
    int sum = 0;

    for (int i = 0; i < 10; i++) {
        dp[1][i] = 1;
    }

    for (int i = 2; i <= num; i++) {
        dp[i][9] = 1;
        for (int j = 8; j >= 0; j--) {
            dp[i][j] = (dp[i][j + 1] + dp[i - 1][j]) % 10007;
        }
    }

    for (int i = 0; i <= 9; i++) {
        sum = (sum + dp[num][i]) % 10007;
    }

    return sum % 10007;
}
