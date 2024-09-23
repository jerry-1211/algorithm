import sys
from collections import deque
M,N,H = map(int,sys.stdin.readline().split())
graph = [[list(map(int,sys.stdin.readline().split())) for _ in range(N)] for _ in range(H)]

di,dj,dh = [0,1,0,-1,0,0],[1,0,-1,0,0,0],[0,0,0,0,1,-1]

def find_tomato(grp):
    q = deque([])    
    for h in range(H):
        for i in range(N):
            for j in range(M):
                if grp[h][i][j] == 1:
                    q.append((h,i,j))
    return q

day = -1
q = find_tomato(graph)

while q :
    for _ in range(len(q)):
        v = q.popleft()
        for k in range(6):
            nh,ni,nj = v[0]+dh[k], v[1]+di[k], v[2]+dj[k]        
            if 0<=nh<H and 0<=ni<N and 0<=nj<M : 
                if graph[nh][ni][nj] == 0 :
                    graph[nh][ni][nj] = 1
                    q.append((nh,ni,nj))
    day += 1

for h in range(H):
    for i in range(N):
        for j in range(M):
            if graph[h][i][j] == 0:
                day = -1                
print(day)
