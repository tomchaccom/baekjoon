import sys 

input = sys.stdin.readline

n, want = map(int, input().strip().split())
tree = list(map(int,input().split()))

cut = max(tree)

low = 0
high = max(tree)
result = 0

while low <= high:

    t_sum = 0
    middle = (low + high) // 2 
    
    t_sum = sum((x - middle) for x in tree if x > middle)
    
    if t_sum >= want: # 합이 원하는 거 보다 많다면, middle의 값이 커져야 한다. 
        result = middle
        low = middle + 1
    else:
        high = middle -1
    
print(result)
