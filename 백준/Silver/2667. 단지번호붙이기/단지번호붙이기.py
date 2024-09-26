import sys
from collections import deque

N = int(input())
graph = [list(map(int,list(input()))) for _ in range(N)]
visited = [[0] * N for _ in range(N)]

di,dj = [0,1,0,-1],[1,0,-1,0]
total_house = 0
lst_house = []

def bfs(i,j):
    q = deque([[i,j]])
    cnt = 1

    while q :
        v = q.popleft()
        for k in range(4):
            ni,nj = v[0] + di[k], v[1] + dj[k]
            if 0<=ni<N and 0<=nj<N :
                if visited[ni][nj] == 0 and graph[ni][nj] == 1 :
                    visited[ni][nj] = 1 
                    q.append([ni,nj])
                    cnt += 1

    lst_house.append(cnt)
    


for i in range(N):
    for j in range(N):
        if graph[i][j] == 1 and visited[i][j] == 0 :
            visited[i][j] =1
            bfs(i,j)        
            total_house += 1

lst_house.sort()
print(total_house)
print(*lst_house,sep="\n")