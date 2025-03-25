import sys

input = sys.stdin.readline

n = int(input())
result = []

for i in range(n):
    x,y = map(int, input().strip().split(" "))
    result.append([x,y])
    
    
data = sorted(result, key = lambda x : (x[1], x[0]))

for ans in data:
    print(ans[0] , ans[1])
    
    