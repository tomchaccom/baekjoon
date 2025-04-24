import sys

input = sys.stdin.readline
write = sys.stdout.write

n = int(input())
result = []

for i in range(n):
    x,y = list(map(int, input().strip().split()))
    result.append(x+y)

for ans in result:
    write(str(ans) + "\n")  