
import sys 

input = sys.stdin.readline

n = int(input())

score = [int(input()) for _ in range(n)]

score.sort()

avg1 = round(sum(score) / n)
cen = round(n//2)

scope = score[-1] - score[0]

def max_count(score):
    dic = {}
    max2 = 0
    
    for i in score:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    
    max2 = max(dic.items(), key = lambda x:x[1])
    
    result = [ i for i in dic if dic[i] == max2[1]]
    result.sort()
    
    if len(result) > 1:
        return result[1]
    else:
        return max2[0]


print(avg1)
print(score[cen])
print(max_count(score))
print(scope)
