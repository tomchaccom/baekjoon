#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n, m;
    cin >> n >> m;

    vector<vector<int>> grid(n, vector<int>(m));
    for (int i = 0; i < n; i++) {
        string line;
        cin >> line;
        for (int j = 0; j < m; j++) {
            grid[i][j] = line[j] - '0';
        }
    }

    vector<int> dx = {0, 0, -1, 1};
    vector<int> dy = {-1, 1, 0, 0};

    vector<vector<int>> dist(n, vector<int>(m, -1));
    queue<pair<int,int>> q;

    // 시작점 (0,0)
    q.push({0, 0});
    dist[0][0] = 1;   // 2178은 칸 수

    while (!q.empty()) {
        auto [cx, cy] = q.front();
        q.pop();

        for (int i = 0; i < 4; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if (grid[nx][ny] == 0) continue;
            if (dist[nx][ny] != -1) continue;

            dist[nx][ny] = dist[cx][cy] + 1;
            q.push({nx, ny});
        }
    }

    cout << dist[n-1][m-1];
}
