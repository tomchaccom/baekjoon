import sys
import math

n = int(sys.stdin.readline())

dp = [0] * (n+1)

for i in range(1,n+1): 
    dp[i] = i
    for j in range(1,int(math.sqrt(i)) + 1): 
        square = j * j
        dp[i] = min(dp[i], dp[i - square] + 1)

print(dp[n])
