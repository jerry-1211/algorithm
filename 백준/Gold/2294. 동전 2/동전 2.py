N, K = map(int,input().split())
dp = [-1] * (K+1)
arr = []

for _ in range(N):
    arr.append(int(input()))

for n in arr:

    if n > K :
        continue

    dp[n] = 1

    for k in range(n+1,K+1):

        if(dp[k-n] == -1 and dp[k] == -1):
            continue

        if(dp[k] == -1) :
            dp[k] = dp[k-n] + 1
            continue

        if (dp[k-n] == -1):
            continue

        dp[k] = min(dp[k-n] + 1, dp[k])

if dp[K] == 0:
    print(-1)
else:
    print(dp[K])

