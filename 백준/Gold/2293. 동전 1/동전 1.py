N,K = map(int,input().split())

arr = []
for _ in range(N):
    arr.append(int(input()))

dp = [0] * (K+1)

for n in arr:
    if n <= K:
        dp[n] += 1
    for k in range(n,K+1):
        if (k-n) > 0 :
            dp[k] = dp[k] + dp[k-n]


print(dp[K])
