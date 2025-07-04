import sys
sys.setrecursionlimit(10000)  # 재귀 제한 늘리기

N,M = map(int, input().split())

campus = []
visited = [[False] * M for _ in range(N)]

for i in range(N):
    campus.append(input().strip())

dx = [0,0,-1,1]
dy = [-1,1,0,0]
global count
count = 0

#Dfs 탐색 (반복문으로 변경)
def dfs(x,y):
    global count
    stack = [(x,y)]
    
    while stack:
        x, y = stack.pop()
        
        if visited[x][y]:
            continue
            
        visited[x][y] = True
        
        # 현재 위치가 사람이면 카운트 증가
        if campus[x][y] == 'P':
            count += 1
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < M:
                if not visited[nx][ny] and campus[nx][ny] != 'X':
                    stack.append((nx,ny))
                
for i in range(N):
    for j in range(M):
        if campus[i][j] == 'I':
            dfs(i,j)
            break

if count == 0:
    print("TT")
else:
    print(count)