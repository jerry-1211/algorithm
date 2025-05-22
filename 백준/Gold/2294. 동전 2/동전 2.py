N, K = map(int,input().split())
dp = [float('inf')] * (K+1)
arr = []

for _ in range(N):
    arr.append(int(input()))

dp[0] = 0

for n in arr:
    for k in range(n, K+1):
        dp[k] = min(dp[k], dp[k-n]+1)


if dp[K] == float('inf'):
    print(-1)
else:
    print(dp[K])

