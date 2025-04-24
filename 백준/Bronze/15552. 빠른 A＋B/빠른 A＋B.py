import sys

input = sys.stdin.readline

n = int(input())
result = []

for i in range(n):
    x,y = list(map(int, input().strip().split()))
    result.append(x+y)

for ans in result:
    print(ans)