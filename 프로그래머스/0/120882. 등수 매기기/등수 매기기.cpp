#include <string>
#include <vector>
#include <numeric>
#include <iostream>

using namespace std;

vector<int> solution(vector<vector<int>> score) {
    vector<int> rank(score.size(), 1);
    vector<double> avg(score.size());
    for (int i = 0; i < avg.size(); i++) {
        avg[i] = (score[i][0] + score[i][1]) / 2.0;
    }
    for (int i = 0; i < avg.size(); i++) {
        for (int j = 0; j < avg.size(); j++) {
            if (avg[i] < avg[j]) rank[i]++;
        }
    }
    return rank;
}