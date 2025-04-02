import sys
input = sys.stdin.readline

N = int(input())
li = []


for i in range(N):
    a,b = 1,0
    M = int(input())
    for j in range(M):
        a,b = b , a + b
    
    li.append([a,b])

for r in li:
    print(r[0],r[1])
    
# 피보나치의 값을 구하는 것이 아니라, 0,1 이 얼마나 쓰였는지를 계산해야한다 