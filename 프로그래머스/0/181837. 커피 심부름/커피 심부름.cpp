#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<string> order) {
    int answer = 0;
    vector<string>::iterator itor = order.begin();
    for (; itor != order.end(); itor++)
        if ((*itor).find("americano")!=std::string::npos)
            answer += 4500;
        else if ((*itor).find("cafelatte")!=std::string::npos)
            answer += 5000;
        else answer += 4500;
    return answer;
}