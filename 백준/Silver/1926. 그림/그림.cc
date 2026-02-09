#include <bits/stdc++.h>
using namespace std;


vector<int> dx = {0,0,-1,1};
vector<int> dy = {-1,1,0,0};

int bfs(int x, int y, int n, int m,
       vector<vector<int>>& graph,
       vector<vector<int>>& visited){
    queue<pair<int,int>> q;
    q.push({x,y});
    visited[x][y] = 1;
    int area = 1;
        
    while(!q.empty()){
        auto[cx, cy] = q.front();
        q.pop();
        
        for(int i = 0; i < 4; i++){
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if(graph[nx][ny] == 0) continue;
            if(visited[nx][ny]) continue;
        
            visited[nx][ny] = 1;
            q.push({nx,ny});
            area++;
        }
         
    }
    return area;
}



int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n, m;
    cin >> n >> m;
    vector<vector<int>> graph(n, vector<int>(m));
    vector<vector<int>> visited(n, vector<int>(m, 0));
    
    for(int i = 0; i < n; i++){
    for(int j = 0; j < m; j++){
        cin >> graph[i][j];
    }
    }

    int pic = 0; // 그림의 갯수 
    int temp;
    int max = 0;
    
    for(int i = 0; i < n; i++){
        
        for(int j = 0 ; j < m; j++){
            if(graph[i][j] == 1 && !visited[i][j]){
                temp = bfs(i,j,n,m,graph,visited);
                if(temp >= max) max = temp;
                pic++;
            }
            
        }
        
    }
    
    cout << pic << "\n" << max;
    
    
}