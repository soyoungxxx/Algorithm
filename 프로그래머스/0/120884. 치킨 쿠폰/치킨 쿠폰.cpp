#include <string>
#include <vector>

using namespace std;

int solution(int chicken) {
    int answer = 0;
    int coupon = chicken;
    while (coupon >= 10) {
        int service = coupon / 10;
        coupon %= 10;
        coupon += service;
        answer += service;
    }
    return answer;
}