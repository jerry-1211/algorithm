from collections import deque

# 치즈가 다 녹은
def check_all_melt():
    ch_sum = 0
    for n in range(N):
        for m in range(M):
            ch_sum += cheese[n][m]

    if ch_sum == 0:
        return True
    return False


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


def add_remaining_cheese():
    global n, m
    tmp = 0
    for n in range(N):
        for m in range(M):
            if cheese[n][m] == 1:
                tmp += 1
    answer.append(tmp)


def expire_cheese():
    global n, m
    for n in range(N):
        for m in range(M):
            if cheese[n][m] == -100_000:
                cheese[n][m] = 0



N,M = map(int,input().split())
cheese = []
cnt = 0
answer = []

for n in range(N):
    cheese.append(list(map(int, input().split())))

di,dj = [0,-1,0,1],[1,0,-1,0]


while not(check_all_melt()):
    add_remaining_cheese()
    bfs(0, 0)
    expire_cheese()
    cnt += 1

print(cnt)
print(answer[-1])



