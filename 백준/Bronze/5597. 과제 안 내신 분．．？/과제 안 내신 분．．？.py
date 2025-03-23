import sys

input = sys.stdin.readline

a = [] 

for _ in range(28):
    a.append(int(input().strip()))

a.sort()

result = []

for i in range(30):
    result.append(i+1)
    


for x in a:
    if x in result:
        result.remove(x)

for t in result:
    print(t)
