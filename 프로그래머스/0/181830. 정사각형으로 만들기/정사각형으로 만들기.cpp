#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr) {
    if (arr.size() > arr[0].size()) {
        int diff = arr.size() - arr[0].size();
        for (int d = 0; d < diff; d++) {
            for (int i = 0; i < arr.size(); i++) {
                arr[i].push_back(0);
            }
        }
    }
    else if (arr.size() < arr[0].size()) {
        int diff = arr[0].size() - arr.size();
        for (int d = 0; d < diff; d++) {
            arr.push_back(vector<int>(arr[0].size(), 0));
        }
    }
    return arr;
}