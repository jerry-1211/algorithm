n = int(input())

dp = [0] * 3000
dp[1],dp[2] = 1,3

for i in range(3,1001):
    dp[i] = (dp[i-2]*2 + dp[i-1])%10007

print(dp[n])