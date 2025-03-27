import sys 

input = sys.stdin.readline

n = int(input())

result = []

for _ in range(n):
    k = int(input())
    if  k!= 0:
        result.append(k)
    else:
        result.pop(-1)
        

print(sum(result))