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
    int dp[101][101];
    int sum = 0;

    for (int i = 1; i < 10; i++) {
        dp[1][i] = 1;
    }

    for (int i = 2; i <= num; i++) {
        dp[i][0] = dp[i - 1][1];
        dp[i][9] = dp[i - 1][8];
        for (int j = 1; j <= 8; j++) {
            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
        }
    }

    for (int i = 0; i <= 9; i++) {
        sum = (sum + dp[num][i]) % 1000000000;
    }

    return sum % 1000000000;
}