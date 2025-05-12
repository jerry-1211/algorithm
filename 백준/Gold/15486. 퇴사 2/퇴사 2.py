N = int(input())

T_arr = [0] * (N+100)
P_arr = [0] * (N+100)
dp = [0] * (N+100)

for i in range(N):
    T_arr[i],P_arr[i] = map(int,input().split())

for i in range(N):  # N-1일까지만 상담 가능 (인덱스는 0부터 N-1까지)
    # 다음 날로 이익 전달 (상담을 하지 않는 경우)
    dp[i+1] = max(dp[i+1], dp[i])

    # 상담을 하는 경우, 상담이 끝난 날에 이익 반영
    next = i + T_arr[i]
    if next <= N:  # 퇴사일 이전에 상담이 끝나는 경우만
        dp[next] = max(dp[next], dp[i] + P_arr[i])

print(dp[N])  # N일(퇴사일)의 최대 이익 출력