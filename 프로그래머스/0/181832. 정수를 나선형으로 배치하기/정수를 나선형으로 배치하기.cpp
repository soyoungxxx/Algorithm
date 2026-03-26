#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(int n) {
    vector<vector<int>> answer(n, vector<int>(n));
    
    // 시작 num
    int num = 1;
    
    // Top, Bottom, Left, Right
    int top = 0, bottom = n - 1;
    int left = 0, right = n - 1;
    
    while (top <= bottom && left <= right) {
        // 왼 > 오
        for (int j = left; j <= right; j++) {
            answer[top][j] = num++;
        }
        top++;
        
        // 위 > 아래
        for (int i = top; i <= bottom; i++) {
            answer[i][right] = num++;
        }
        right--;
        
        // 오 > 왼
        for (int j = right; j >= left; j--) {
            answer[bottom][j] = num++;
        }
        bottom--;
        
        // 아래 > 위
        for (int i = bottom; i >= top; i--) {
            answer[i][left] = num++;
        }
        left++;
    }
    
    return answer;
}