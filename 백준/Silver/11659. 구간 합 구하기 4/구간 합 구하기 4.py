import sys
input = sys.stdin.readline

N,M = map(int,input().split())
lst = [0] + list(map(int,input().split()))

dp = [0] * (N+1)

for i in range(1,len(lst)):
    dp[i] = dp[i-1] +lst[i]

for _ in range(M):
    i,j = map(int,input().split())
    print(dp[j]-dp[i-1])
