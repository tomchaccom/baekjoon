import math as m
n = int(input())

# 저거 가로가 긴거는 무조건 두개가 세트로 들어가야 한다.
# 가로가 긴거의 갯수를 줄이면서 4,2,2 끼리의 조합을 통해서 순서 배치가 요구된다
dp = {} 

dp[1] = 1
dp[2] = 2
#dp[3] = 3 
#dp[4] = 5
#dp[5] = 8
#dp[6] = 13

for i in range(3,n+1):
    dp[i] = dp[i-1] +dp[i-2]

print(dp[n] % 10007)