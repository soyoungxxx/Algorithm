#include <string>
#include <vector>
#include <numeric>

using namespace std;

int solution(int a, int b) {
    int answer = 1;
    int g = gcd(a, b);
    b /= g;
    for (int i = 2; i <= b; i++) {
        if (b % i == 0) {
            if (i != 2 && i != 5) {
                answer = 2;
                break;
            }
            while (b % i == 0) {
                b /= i;
            }
        }
    }
    
    return answer;
}