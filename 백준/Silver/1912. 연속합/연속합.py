import sys
input = sys.stdin.readline

N = int(input())
lst = [0] + list(map(int,input().split()))
dp = [0] * (N+1)

for i in range(1,N+1):
    if dp[i-1] < 0 :
        dp[i] = lst[i] + 0
        
    else :
        dp[i] = lst[i] + dp[i-1]
    
        
print(max(dp[1:]))
