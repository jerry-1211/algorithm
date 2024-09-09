from collections import deque

N = int(input())
graph = [list(map(int,input().split())) for _ in range(N)]

mn = min(map(min,graph))
mx = max(map(max,graph))
di,dj = [0,1,0,-1],[1,0,-1,0]
mx_count = 1
count = 0 


for c in range(mn,mx+1) : 
    count = 0 
    visited = [[0] * N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if graph[i][j] > c and not(visited[i][j]):
                q = deque([[i,j]])
                visited[i][j] = 1
                while q:
                    v = q.popleft()
                    for k in range(4):
                        ni,nj = v[0]+di[k], v[1]+dj[k]
                        if 0<=ni<N and 0<=nj<N and graph[ni][nj]>c and visited[ni][nj]==0:
                            q.append([ni,nj])
                            visited[ni][nj] = 1
                count += 1
    mx_count = max(count,mx_count)
print(mx_count)

