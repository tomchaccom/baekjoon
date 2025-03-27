import sys

input = sys.stdin.readline

def round2(num):
    if num - int(num) >= 0.5:
        return int(num) +1
    else:
        return int(num)
    
n = int(input().strip())

if n == 0:
    print(0)
else:
    score = [int(input()) for _ in range(n)]
    
    score.sort()
    cut = round2(n*0.15)
    sum_score = sum(score[cut:len(score)-cut])
    
    print(round2(sum_score / len(score[cut:len(score)-cut])))