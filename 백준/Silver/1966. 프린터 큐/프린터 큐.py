import sys

input = sys.stdin.readline

test = int(input())
que = []
result = []

for _ in range(test):
    count = 1
    
    N, M = map(int, input().strip().split(" "))    
    que = list(map(int, input().split()))
    
    while True:
        
        if que[0] < max(que):
            que.append(que.pop(0))
            M = M - 1 if M > 0 else len(que) - 1

        else:
            if M == 0:
                result.append(count)
                break
            que.pop(0)
            count+=1
            M -= 1  
        
    # 우선 순위가 빠른 것을 먼저 출력해야한다 .
    # 큐라서 선입선출 즉 뒤에 있는게 먼저 들어온거라고 보고 출력하기 
    # 우선 순위가 다 같다면 같은거 먼저 다 뽑아내고 출력 
    
    que.clear()

for r in result:
    print(r)
    
    