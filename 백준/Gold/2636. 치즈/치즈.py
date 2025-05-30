from collections import deque

N,M = map(int,input().split())

cheese = []
for n in range(N):
    cheese.append(list(map(int, input().split())))

di,dj = [0,-1,0,1],[1,0,-1,0]

def cheese_sum():
    ch_sum = 0
    for n in range(N):
        for m in range(M):
            ch_sum += cheese[n][m]
    return ch_sum

def bfs(x,y):
    q = deque([[x,y]])
    visit = [[0] * M for _ in range(N)]

    while(q):
        v = q.popleft()
        for k in range(4):
            ni,nj = v[0] + di[k], v[1] + dj[k]
            if 0<=ni<N and 0<=nj<M:
                if cheese[ni][nj] == 0 and visit[ni][nj] == 0:
                    visit[ni][nj] = 1
                    q.append([ni,nj])
                if cheese[ni][nj] == 1:
                    cheese[ni][nj] = -100_000



cnt = 0
answer = []
while cheese_sum()!=0:

    tmp = 0
    for n in range(N):
        for m in range(M):
            if cheese[n][m] == 1:
                tmp += 1
    answer.append(tmp)

    bfs(0, 0)

    for n in range(N):
        for m in range(M):
            if cheese[n][m] == -100_000:
                cheese[n][m] = 0



    cnt += 1

print(cnt)
print(answer[-1])



