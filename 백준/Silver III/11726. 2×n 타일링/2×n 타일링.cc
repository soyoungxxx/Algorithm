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
        return 2;
    }

    vector<int> dp = {1, 1, 2};

    for (int i = 3; i <= num; i++) {
        dp.push_back((dp[i - 1] + dp[i - 2]) % 10007);
    }

    return dp[num];
}