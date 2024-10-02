import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    N = int(input())
    coin = list(map(int,input().split()))
    M = int(input())

    dp = [0] * (2*M+2)

    for c in coin :
        dp[c] += 1 
        for i in range(c+1,2*M-1):
            dp[i] += dp[i-c]

    print(dp[M])

