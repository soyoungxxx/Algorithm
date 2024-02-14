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
    if (num == 1) {
        return 1;
    }

    else if (num == 2) {
        return 3;
    }

    vector<int> dp = {1, 1, 3};

    for (int i = 3; i <= num; i++) {
        int tmp = 0;
        if (i % 2 != 0) {
            tmp = (dp[i - 1] * 2 - 1) % 10007;
        } else {
            tmp = (dp[i - 1] * 2 + 1) % 10007;
        }
        dp.push_back(tmp);
    }

    return dp[num];
}