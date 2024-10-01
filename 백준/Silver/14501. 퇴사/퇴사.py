import sys
input = sys.stdin.readline

N = int(input())
dp = [0] * (N+1)


for i in range(1,N+1) :
    T,P = map(int,input().split())

    dp[i] = max(dp[i],dp[i-1])
    if i+T-1 > N : 
        continue
    else :
        dp[i+T-1] = max(dp[i-1]+P,dp[i+T-1])
    
print(max(dp))
    