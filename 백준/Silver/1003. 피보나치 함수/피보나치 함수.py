T = int(input())

for _ in range(T):
    N = int(input())

    dp = [0] * 43
    dp[1] = 1

    for i in range(2,N+2):
        dp[i] = dp[i-2] + dp[i-1]

    if N == 0:
        print(1,0)
    else : 
        print(dp[N-1],dp[N])