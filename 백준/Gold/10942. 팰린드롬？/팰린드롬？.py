import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int,input().split()))
dp = [[0]*N for i in range(N)]


for i in range(len(arr)):
    dp[i][i] = 1

for i in range(0,len(arr)-1):
    if arr[i:i+2] == arr[i:i+2][::-1]:
        dp[i][i+1] = 1

# 1,1 -> 0,2
# 2,2 -> 1,3 -> 0,4
# . . .
# 6,6 -> 5,7

for i in range(1,N):
    for j in range(0,i+1):
        x,y = i-j, i+j
        if  0<=x-1<N and 0<=y+1<N:
            if dp[x][y] and arr[x-1] == arr[y+1]:
                dp[x-1][y+1] = 1


# 1,2 -> 0,3
# 2,3 -> 1,4 -> 0,5
# . . .
# 6,7 -> X


for i in range(1, N):
    for j in range(0, i + 1):
        x, y = i - j, i + j + 1
        if  0<=x-1<N and 0<=y+1<N:
            if dp[x][y] and arr[x-1] == arr[y+1]:
                dp[x-1][y+1] = 1



T = int(input())
for _ in range(T):
    q,p = map(int,input().split())
    print(dp[q-1][p-1])




