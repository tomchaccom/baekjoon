import sys
from itertools import combinations

input = sys.stdin.readline

N = int(input().strip())
result = []


for i in range(N):
    result.append(input().strip())


dp = {}
dp[1] = 1 
dp[2] = 2
dp[3] = 4

for j in range(4,12):
    dp[j] = dp[j-3] + dp[j-2] + dp[j-1]

for k in result:
    print(dp[int(k)])



# 점화식 먼저 구하기 
# dp[1] = 1 
# dp[2] = 1 + 1 / 2
# dp[3] = 1,1,1 1,2 2,1 3 / 4
# dp[4] = 1111 211 121 112 22 13 31 22 / 7
# dp[5] = 1 * 5 1개 2111 *4 221 * 3 311 *3 32 23 /13
# dp[6] = 1 * 6 1개 21111 * 5 2211 * 6 222 3111 * 4 33 321 * 6 /24 

    

   
        