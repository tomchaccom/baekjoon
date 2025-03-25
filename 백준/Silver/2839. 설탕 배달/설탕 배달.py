import sys

input = sys.stdin.readline

n = int(input())
    
count5 = n // 5 # 최대한 5로 나누기 
count3 = 0
    
while count5 >=0:
    remainer = n - 5* count5
    if remainer % 3 == 0:
        count3 += remainer // 3
        print(count5 + count3)
        break
    count5 -= 1
else:
    print(-1)