import sys
from collections import deque
input = sys.stdin.readline

s,b = map(int,input().split())

visited = [0] * 100001


def bfs(start, end):
    
    que = deque([start])
    visited[start] = 1

    while que:
        v = que.popleft()
        if v == end:
            print(visited[v] - 1)
            return

        # 그러면 그냥 end 보다 커지면 탈락 같으면 종료 이런식으로 만들면 되는건가.. 
        for next_pos in (v - 1, v + 1 , v * 2):
            if 0 <= next_pos < 100001 and visited[next_pos] == 0:
                visited[next_pos] = visited[v] + 1
                que.append(next_pos)
bfs(s,b)



        

        


