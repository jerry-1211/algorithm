
N = int(input())

numList = [0] + [int(input()) for _ in range(N)]

dp = [0] * (N+1)

dp[1] = numList[1]

if N != 1:
    dp[2] = numList[1] + numList[2]

    for i in range(3, N+1):
        dp[i] = max(
            dp[i-2] + numList[i],
            dp[i-3] + numList[i-1] + numList[i]
        )

print(dp[-1])