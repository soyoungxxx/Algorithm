#include <string>
#include <vector>

using namespace std;

int solution(string A, string B) {
    int answer = 0;
    string Acp = A;
    while (Acp != B) {
        Acp = Acp.back() + Acp.substr(0, Acp.size() - 1);
        if (Acp == A) {
            answer = -1;
            break;
        }
        answer += 1;
    }
    return answer;
}