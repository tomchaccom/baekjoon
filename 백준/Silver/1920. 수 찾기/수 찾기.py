import sys

input = sys.stdin.readline

N = int(input())
n_list = list(map(int, input().strip().split()))

n_list.sort()

M = int(input())
m_list = list(map(int, input().strip().split()))


for m in m_list:
    left = 0
    right = N-1
    
    while left <= right:
        mid = (left + right) // 2
        
        if m > n_list[mid]:
            left = mid + 1
        elif m < n_list[mid]:
            right = mid -1
        else:
            left = mid
            right = mid 
            break

    if left == mid and right == mid:
        print(1)
    else:
        print(0)