N = int(input())

graph = [list(map(int,input().split())) for _ in range(N)]
dp = [[0] * N for _ in range(N)]
dp[0][0] = 1

for i in range(N):
    for j in range(N):
        if dp[i][j]>0 :
            scope = graph[i][j]
            ni,nj = i+scope, j+scope

            if scope==0:
                break

            if 0<=ni<N:
                dp[ni][j] += dp[i][j]
            if 0<=nj<N:
                dp[i][nj] += dp[i][j]

print(dp[-1][-1])