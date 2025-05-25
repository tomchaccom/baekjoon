import sys
sys.setrecursionlimit(10000)  # 재귀 깊이 제한 늘려줌
input = sys.stdin.readline

# 정점 수 N, 간선 수 M 입력
N, M = map(int, input().split())

# 인접 리스트로 그래프 초기화
graph = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)

# 간선 정보 입력받아 양방향 그래프 구성
for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

# DFS 함수 정의
def dfs(v):
    visited[v] = True
    for neighbor in graph[v]:
        if not visited[neighbor]:
            dfs(neighbor)

# 연결 요소 개수 세기
count = 0
for i in range(1, N + 1):
    if not visited[i]:  # 방문 안 한 노드 발견 시
        dfs(i)          # 그 노드를 시작으로 DFS
        count += 1      # 새로운 연결 요소 발견

print(count)
