#1 1 1 2 2 3 4 5 7 9 12 

case= int(input())

dp ={}
result = []

dp[1] = dp[2] = dp[3] = 1
dp[4] = dp[5] = 2

# dp[6] = dp[5] + dp[1] 3
# dp[7] = dp[6] + dp[2] # 3 + 1 
# dp[8] = dp[7] + dp[3] # 4 + 1 
# dp[9] = dp[8] + dp[4] # 5 + 2
# dp[10] = dp[9] + dp[5] 7 + 2
# dp[11] = dp[10] + dp[6] 9 + 3
# dp[12] = dp[11] + dp[7] 12 + 4

for _ in range(case):
    number = int(input())

    if number > 5:
        for i in range(6,number + 1):
            dp[i] = dp[i-1] + dp[i-5]
        result.append(dp[number])

    else:
        result.append(dp[number])

for t in result:
    print(t)