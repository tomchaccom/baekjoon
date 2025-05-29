import sys
from collections import deque
input = sys.stdin.readline

graph = []
start = None
n, m = map(int, input().split())

for _ in range(n):
    graph.append(list(map(int, input().split())))


visited = [[False] * m for _ in range(n)]
dist = [[-1] * m for _ in range(n)]

dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]


for i in range(n):
    for j in range(m):
        if graph[i][j] == 2:
            start = (j, i)

def bfs(x, y):
    que = deque()
    que.append((x, y))
    visited[y][x] = True
    dist[y][x] = 0 

    while que:
        x, y = que.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < m and 0 <= ny < n:
                if graph[ny][nx] == 1 and not visited[ny][nx]:
                    visited[ny][nx] = True
                    dist[ny][nx] = dist[y][x] + 1
                    que.append((nx, ny))


bfs(start[0], start[1])


for i in range(n):
    for j in range(m):
        if graph[i][j] == 0:
            print(0, end=' ')
        else:
            print(dist[i][j], end=' ')
    print()
