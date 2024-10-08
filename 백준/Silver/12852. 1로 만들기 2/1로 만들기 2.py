import sys
input = sys.stdin.readline

N = int(input())

INF = sys.maxsize
dp = [INF]*(N*4)
dp[0],dp[1] = 0,0

for i in range(1,N+1):
    dp[i*3] = min(dp[i]+1, dp[i*3])
    dp[i*2] = min(dp[i]+1, dp[i*2])
    dp[i+1] = min(dp[i]+1, dp[i+1])


dp = dp[:N+1]
cur = N
lst = [N]


for k in range(N,0,-1):
    if dp[k] == dp[cur]-1 and (k*3==cur or (k+1)==cur or (k*2)==cur) :
        lst.append(k)
        cur = k

print(dp[N])
print(*lst)