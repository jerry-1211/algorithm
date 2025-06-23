n = int(input())
lose = list(map(int, input().split()))
joy = list(map(int, input().split()))

# dp[i] = 체력이 i일 때 얻을 수 있는 최대 기쁨
dp = [0] * 100

for i in range(n):
    # 뒤에서부터 계산해야 중복 계산 방지
    for j in range(99, lose[i] - 1, -1):
        dp[j] = max(dp[j], dp[j - lose[i]] + joy[i])

print(dp[99])
