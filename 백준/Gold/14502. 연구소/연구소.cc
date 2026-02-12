#include <bits/stdc++.h>
using namespace std;


int dx[4] = {0,0,-1,1};
int dy[4] = {-1,1,0,0};

void bfs(int n, int m, int temp[8][8] 
        , vector<pair<int, int>>& virus){
    
    queue<pair<int, int>> q;
    
    for(auto v : virus){
        q.push(v);
    }

    while(!q.empty()){
        auto[cx,cy] = q.front();
        q.pop();

        for(int i =0; i< 4; i++){

            int nx = dx[i] + cx;
            int ny = dy[i] + cy;


            if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if(temp[nx][ny] != 0) continue;

            temp[nx][ny] = 2;
            q.push({nx,ny});

        }

    }




}

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n,m;

    cin >> n >> m;

    int map[8][8];
    int temp[8][8];

    vector<pair<int,int>> empty;
    vector<pair<int,int>> virus;
    int answer = 0;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> map[i][j]; // 2차원 배열 입력받기 

            if(map[i][j] == 0) empty.push_back({i,j});
            if(map[i][j] == 2) virus.push_back({i,j});

        }
    }

    // 왜 삼중 반복문을 사용하지? 3개의 좌표를 선택하기 위함이네
    // 그러면 어떻게 잡아내지..? 
    for(int i =0 ; i < empty.size(); i++){
        for(int j = i + 1; j < empty.size(); j++){
            for(int k = j +1 ; k < empty.size(); k++){

                memcpy(temp, map, sizeof(map)) ; // 이거는 공부하기 
                
                auto [x1,y1] = empty[i];
                auto [x2,y2] = empty[j];
                auto [x3,y3] = empty[k];

                temp[x1][y1] = 1;
                temp[x2][y2] = 1;
                temp[x3][y3] = 1;
                
                bfs(n,m,temp,virus);

                int safe = 0;

                for(int a = 0; a < n; a++){
                    for(int b =0; b < m ; b++){
                        if(temp[a][b] == 0){
                            safe++;
                        }
                    }
                }

                answer = max(safe, answer);

            } 
        }
    }
    cout << answer << "\n";

}