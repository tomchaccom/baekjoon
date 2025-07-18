import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
visited = [[False for _ in range(n)] for _ in range(n)]

apt = []

for _ in range(n):
    row = list(map(int, input().strip()))
    apt.append(row)

ny = [-1,1,0,0]  # 상하좌우를 기준으로 y축 이동
nx = [0,0,-1,1]  # 상하좌우를 기준으로 x축 이동

def bfs(x,y):

    que = deque()
    que.append((x,y)) # 시작점을 집어넣기 
    visited[x][y] = True
    count = 1 

    while que: # que가 빌 때까지 돌리기  

        x2, y2 = que.popleft()

        for i in range(4): # 상하좌우에 대한 좌표를 입력하기 그러나 이 상하좌우 연산이 먹히기 않는 경우는 ? 
        # 흠.. dy ,dx가 정사각형의 범위를 벗어나면 안되도록 해야하나
            dx = nx[i] + x2
            dy = ny[i] + y2
            if 0 <= dx < n and 0 <= dy < n:  
                if apt[dx][dy] == 1 and not visited[dx][dy]:  
                    visited[dx][dy] = True
                    que.append((dx, dy)) 
                    count += 1

        # 이어진의 1의 집합이 없는 경우를 어떻게 처리할 것? 
    return count

answer = []
# 아파트 단지를 어떻게 분리하고, 출력할 것인지
# 출력은 시작점 bfs 호출로 
for i in range(n):
    for j in range(n):
        if not visited[i][j] and apt[i][j] == 1:
            answer.append(bfs(i, j))  # (행, 열)

print(len(answer))

answer.sort()

for i in answer:
    print(i)
