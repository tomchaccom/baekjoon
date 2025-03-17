import sys

from itertools import combinations

input = sys.stdin.readline

N, M = map(int, input().strip().split())

n_list = list(map(int , input().strip().split()))


sum_list = list(combinations(n_list,3)) 
ans = []

for i in sum_list:
    ans.append(i[0] + i[1] + i[2])

ans.sort()

t = [x for x in ans if x <= M]

print(t.pop(len(t) - 1))


    
    

    
    

