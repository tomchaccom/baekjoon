import sys

input = sys.stdin.readline
N, M = map(int, input().strip().split(" "))

meter = [int(input()) for _ in range(N)]

low = 1
high = max(meter)
result = 0

while low <= high:
    middle = (low + high) // 2
    
    sum2 = 0
    for i in meter:
        sum2 += i // middle
    
    if sum2 >= M:  # sum2가 M 이상이면 더 큰 x를 찾기 위해 low를 증가
        result = middle  # 현재 middle이 가능하면 result에 기록
        low = middle + 1
    else:  # sum2가 M보다 작으면 중간 값을 줄여야 하므로 high를 감소
        high = middle - 1

print(result)
