
import sys

input = sys.stdin.readline

n = int(input())
result = []

for _ in range(n):
    key, value = map(int, input().strip().split())
    result.append([key, value])
    
data = sorted(result, key = lambda x : (x[0] , x[1]))

for i in data:
    print(i[0] , i[1])