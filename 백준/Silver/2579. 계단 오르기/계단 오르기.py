N = int(input())
dp = [0] * (N+1)
lst = [0] + [int(input()) for _ in range(N)]

dp[1] = lst[1]
if N > 1:
    dp[2] = lst[1] + lst[2]
    for k in range(3,N+1):
        dp[k] = max(dp[k-3]+lst[k-1]+lst[k],dp[k-2]+lst[k])
print(dp[-1])
