import sys

input = sys.stdin.readline
n = int(input())

cp = []
zero = 0
one = 0


for i in range(n):
    cp.append(list(map(int, input().split())))

# 좌표 (x, y)에서 시작하는 size 크기의 정사각형을 검사
def dc(size, x, y):
    global zero, one
    
    count = 0
    for i in range(x,x+size):
        for j in range(y,y+size):
            count += cp[i][j]
    if count == size * size:
        one += 1
        return
    elif count == 0:
        zero += 1
        return
    
    size = size // 2 
    #1사분면
    p_sum = 0
    for i in range(x, x + size):
        for j in range(y, y + size):
            p_sum += cp[i][j]
    if p_sum == size * size:
        one += 1
    elif p_sum == 0:
        zero += 1
    else:
        dc(size, x, y)  

    # 2사분면
    p_sum = 0 
    for i in range(x, x + size):
        for j in range(y + size, y + 2 * size):
            p_sum += cp[i][j]
    if p_sum == size * size:
        one += 1
    elif p_sum == 0:
        zero += 1
    else:
        dc(size, x, y + size)

    # 3사분면
    p_sum = 0
    for i in range(x + size, x + 2 * size):
        for j in range(y, y + size):
            p_sum += cp[i][j]
    if p_sum == size * size:
        one += 1
    elif p_sum == 0:
        zero += 1
    else:
        dc(size, x + size, y) 

    # 4사분면
    p_sum = 0
    for i in range(x + size, x + 2 * size):
        for j in range(y + size, y + 2 * size):
            p_sum += cp[i][j]
    if p_sum == size * size:
        one += 1
    elif p_sum == 0:
        zero += 1
    else:
        dc(size, x + size, y + size) 


dc(n, 0, 0)

print(zero)
print(one)
