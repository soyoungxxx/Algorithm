#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int i, int j, int k) {
    int answer = 0;
    string target = to_string(k);

    for (int num = i; num <= j; num++) {
        string s = to_string(num);
        size_t pos = s.find(target);

        while (pos != string::npos) {
            answer++;
            pos = s.find(target, pos + 1);
        }
    }

    return answer;
}