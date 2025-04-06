n = int(input())

dp = {1: 0}

for i in range(2, n + 1):
    
    dp[i] = dp[i - 1] + 1
    
    # 2로 나누어 떨어질 때 최소값 비교
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i // 2] + 1)
    
    # 3으로 나누어 떨어질 때 최소값 비교
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i // 3] + 1)

print(dp[n])
