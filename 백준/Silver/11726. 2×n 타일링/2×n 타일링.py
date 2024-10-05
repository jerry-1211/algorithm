
N = int(input())

dp = [0] * (N+10)

dp[1],dp[2],dp[3] = 1,2,3


for i in range(4,N+2):
    dp[i] = (dp[i-2] + dp[i-1])  % 10007

print(dp[N])
