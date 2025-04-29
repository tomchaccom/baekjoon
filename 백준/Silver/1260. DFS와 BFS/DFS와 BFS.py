from collections import deque

n,m,v = map(int, input().split())

graph = [[] for _ in range(n+1)]

for i in range(m):
    x,y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

# print(graph)

for g in graph:
    g.sort()

d_visited = [False] * (n + 1)
b_visited = [False] * (n + 1)

def bfs(x):
    que = deque()
    que.append(x)
    b_visited[x] = True

    while que:
        q = que.popleft()
        print(q, end =' ')

        for next in graph[q]:
            if not b_visited[next]:
                que.append(next)
                b_visited[next] = True

def dfs(x):

    d_visited[x] = True
    print(x, end = ' ')

    for next in graph[x]:
        if not d_visited[next]:
            dfs(next)

dfs(v)
print()
bfs(v)
                