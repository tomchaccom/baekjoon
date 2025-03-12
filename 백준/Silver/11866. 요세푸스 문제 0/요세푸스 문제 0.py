import sys

input = sys.stdin.readline

N, K = map(int, input().strip().split())

a = []

for i in range(N):
    a.append(i+1)
    
ans = [] 
index = 0

while len(a) != 0:
    index += (K - 1)
    index = index % len(a)
    ans.append(a.pop(index))

## 문자
print("<",end="")
for i in range(N-1):
    print(ans[i],end=", ")
print(ans[N-1], end = "")
print(">",end="")

