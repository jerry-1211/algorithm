import sys
from collections import deque

N,M = map(int,input().split(" "))

arr = [list(map(int,input().split(" "))) for _ in range(N)]
visit = [[-1] * M for _ in range(N)]

target = []
for n in range(N):
    for m in range(M):
        if arr[n][m] == 2:
            arr[n][m] = 0
            target = [n,m]
            break

q = deque([target])
di,dj = [0,1,0,-1], [1,0,-1,0]

for n in range(N):
    for m in range(M):
        if arr[n][m] == 0 :
            visit[n][m] = 0

while(q):
    v = q.popleft()
    for k in range(4):
        ni = v[0] + di[k]
        nj = v[1] + dj[k]

        if 0<= ni < N and 0<= nj < M:
            if arr[ni][nj] == 1  and visit[ni][nj] == -1 :
                q.append([ni,nj])
                visit[ni][nj] = visit[v[0]][v[1]] + 1

for row in visit:
    print(*row)
