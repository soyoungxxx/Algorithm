#include <iostream>
#include <string>

using namespace std;

int calc(int num);

int main() {
    int x, y;
    string week[7] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    cin >> x >> y;

    int num = calc(x) + y;
    int result = num % 7 - 1;

    if (num % 7 == 0) result = 6;

    cout << week[result] << "\n";
}

int calc(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
        if (i == 2) {
            sum += 28;
        } else if (i == 4 || i == 6 || i == 9 || i == 11) {
            sum += 30;
        } else {
            sum += 31;
        }
    }
    return sum;
}