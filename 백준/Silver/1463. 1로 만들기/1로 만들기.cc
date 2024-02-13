#include <iostream>
#include <string>
#include <vector>

using namespace std;

int calculate(int num);

int main() {
    int X;
    cin >> X;

    // x가 3으로 나누어 떨어지면 나눔
    // 2로 나누어 떨어지면 나눔
    // 1을 뺌

    int result = calculate(X);

    cout << result;
}

int calculate(int num) {
    if (num == 1) {
        return 0;
    }

    else if (num == 2 || num == 3) {
        return 1;
    }

    vector<int> dp = {0, 0, 1, 1};

    for (int i = 4; i <= num; i++) {
        if (i % 3 == 0 && i % 2 == 0) {
            dp.push_back((min(min(dp[i / 2], dp[i / 3]), dp[i - 1])) + 1);
        } else if (i % 3 == 0) {
            dp.push_back(min(dp[i / 3], dp[i - 1]) + 1);
        } else if (i % 2 == 0) {
            dp.push_back(min(dp[i / 2], dp[i - 1]) + 1);
        } else {
            dp.push_back(dp[i - 1] + 1);
        }
    }

    return dp[num];
}