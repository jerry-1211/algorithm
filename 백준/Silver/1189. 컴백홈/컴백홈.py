R,C,K = map(int,input().split())

arr = []

for _ in range(R):
    arr.append(list(input()))

visit = [[0] * C for _ in range(R)]

for i in range(R):
    for j in range(C):
        if arr[i][j] == "T":
            visit[i][j] = -1

target = [0,C-1]
di,dj = [0,-1,0,1], [1,0,-1,0]
cnt = 1

result = 0
def recursion(i,j,n):
    global result
    if n == K:
        if i == target[0] and j == target[1]:
            result += 1
        return 0

    for k in range(4):
        ni,nj = i + di[k], j + dj[k]
        if 0<=ni<R and 0<=nj<C:
            if visit[ni][nj] == 0:
                visit[i][j] = 1
                recursion(ni,nj,n+1)
                visit[i][j] = 0
    return 0

recursion(R-1,0,1)
print(result)