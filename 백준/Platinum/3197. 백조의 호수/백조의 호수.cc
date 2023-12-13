#include <iostream>
#include <queue>
#include <vector>
#include <cstring>

using namespace std;

#define MAX 1500
#define endl "\n"

int R, C;
bool cond;

queue<pair<int, int>> swan, nextSwan, ice, nextIce;
char lake[MAX][MAX];
bool visited[MAX][MAX];
pair<int, int> start;

int dx[4] = {0, 0, -1, 1};
int dy[4] = {-1, 1, 0, 0};

void input() {
    cond = false;
    cin >> R >> C;
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cin >> lake[i][j];
            visited[i][j] = false;
            if (lake[i][j] != 'X') ice.push(make_pair(i, j));
            if (lake[i][j] == 'L') {
                start.first = i;
                start.second = j;
            }
        }
    }
}

void swanBFS() {
    while(!swan.empty() && !cond) {
        int current_x = swan.front().first;
        int current_y = swan.front().second;
        swan.pop();
        for(int k = 0; k < 4; k++) {
            int x = current_x + dx[k];
            int y = current_y + dy[k];
            if (x >= 0 && y >= 0 && x < R && y < C) {
                if (visited[x][y] == false) {
                    visited[x][y] = true;
                    if (lake[x][y] == 'L') {
                        cond = true;
                        break;
                    }
                    else if (lake[x][y] == 'X') {
                        nextSwan.push(make_pair(x, y));
                    }
                    else if (lake[x][y] == '.') {
                        swan.push(make_pair(x, y));
                    }
                }
            }
        }
    }
}

void iceBFS() {
    while(!ice.empty()) {
        int current_x = ice.front().first;
        int current_y = ice.front().second;
        ice.pop();
        for (int k = 0; k < 4; k++) {
            int x = current_x + dx[k];
            int y = current_y + dy[k];
            if (x >= 0 && y >= 0 && x < R && y < C) {
                if (lake[x][y] == 'X') {
                    lake[x][y] = '.';
                    nextIce.push(make_pair(x, y));
                }
            }
        }
    }
}

// void print() {
//     printf("----------------\n");
//     for (int i = 0; i < R; i++) {
//         for (int j = 0; j < C; j++) {
//             printf("%c ", lake[i][j]);
//         }
//         printf(endl);
//     }
// }

void Solution() {
    int result = 0;
    swan.push(make_pair(start.first, start.second));
    visited[start.first][start.second] = true;

    while (cond == false) {
        swanBFS();
        if (cond == false) {
            iceBFS();
            ice = nextIce;
            swan = nextSwan;
            while (!nextIce.empty()) nextIce.pop();
            while (!nextSwan.empty()) nextSwan.pop();
            result += 1;
        }
    }
    cout << result << endl;
}

int main() {
    input();
    if (R == 1 && C == 1) {
        cout << "0" << endl;
    } else {
        Solution();
    }
    return 0;
}