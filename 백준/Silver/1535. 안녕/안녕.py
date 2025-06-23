N = int(input())
L = list(map(int, input().split()))  # 체력 감소량
J = list(map(int, input().split()))  # 기쁨 증가량

dp = [0] * 100  # 체력이 0~99일 때의 최대 기쁨

for i in range(N):
    loss = L[i]
    joy = J[i]
    # 뒤에서부터 갱신해야 중복 선택 방지됨 (0/1 Knapsack 패턴)
    for hp in range(99, loss - 1, -1):
        dp[hp] = max(dp[hp], dp[hp - loss] + joy)

print(dp[99])