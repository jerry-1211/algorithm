
N,K = map(int,input().split())

lst = [(0,0)]
dp = [[0] * (K+1) for _ in range(N+1)]

for _ in range(N) : 
    x,y = map(int,input().split())
    lst.append((x,y))

for i in range(len(lst)):
    w,v = lst[i]
    for j in range(1,K+1) : 
        if j < w :
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i-1][j-w]+v, dp[i-1][j])

print(dp[-1][-1])
            
        