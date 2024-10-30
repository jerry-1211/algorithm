import sys
N = int(input())
total = 1000010
div = 1000000009

dp = [0] * (total)
dp[1],dp[2],dp[3] =  1,2,4

for i in range(4,total):
    dp[i] = (dp[i-3]+dp[i-2]+dp[i-1]) % div

for _ in range(N):
    K = int(input())
    print(dp[K])
    
