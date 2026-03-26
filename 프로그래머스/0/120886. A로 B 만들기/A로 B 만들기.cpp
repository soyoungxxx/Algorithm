#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(string before, string after) {
    int answer = 1;
    for (char c: after) {
        if (!(before.find(c) != string::npos)) {
            answer = 0;
            break;
        }
        before.erase(before.find(c), 1);
    }
    return answer;
}