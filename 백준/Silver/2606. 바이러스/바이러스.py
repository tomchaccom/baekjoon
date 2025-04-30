com = int(input())
n = int(input())

graph = [[] for _ in range(com + 1)]
visited = [False] * (com + 1)

for _ in range(n):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

def dfs(v):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(i)

dfs(1)
print(visited.count(True) - 1)  # 1번 컴퓨터를 제외한 감염된 컴퓨터 수
