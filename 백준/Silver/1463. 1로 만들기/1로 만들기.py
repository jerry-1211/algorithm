import sys
input = sys.stdin.readline

N = int(input())
INF = sys.maxsize

dp = [INF] * (N*4)

dp[1] = 0

for i in range(1,len(dp[:N+1])):
    dp[i*2] = min(dp[i*2],dp[i]+1)
    dp[i*3] = min(dp[i*3],dp[i]+1)
    dp[i+1] = min(dp[i+1],dp[i]+1)

print(dp[N])