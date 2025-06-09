N = int(input())

dp = [[] for _ in range(2)]

dp[0],dp[1] = (1,1),(2,2)

S = 0
for i in range(N-2):
    S += sum(dp[0])
    tmp = dp[1][0] * 2 + dp[0][0]
    dp[0] = dp[1]
    dp[1] = (tmp,tmp)


for i in dp:
    S += sum(i)


if N >= 2:
    print((S+1) % 9901)
elif N == 2:
    print(7)
elif N == 1:
    print(3)





