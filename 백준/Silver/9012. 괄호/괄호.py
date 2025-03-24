import sys 

input = sys.stdin.readline

n = int(input())
a = []

for _ in range(n):
    a.append(input().strip())


result = []

# 일단 하나 집어 넣고 개수 카운트 해서 pop 하기 근데.. 이거 크게 도움은 안되는데

left = 0
right = 0

for i in range(n):
    
    for j in range(len(a[i])):
        
        if a[i][j] == "(" and left >= right:
            left += 1
        else:
            right += 1
    
    if left == right:
        print("YES")
        left = 0
        right = 0
    else:
        print("NO")
        left = 0
        right = 0