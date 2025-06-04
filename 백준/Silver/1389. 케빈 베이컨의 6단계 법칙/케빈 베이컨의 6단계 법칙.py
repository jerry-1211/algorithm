from collections import deque

N,M = map(int,input().split(" "))

arr = [[] for _ in range(N+1)]

for _ in range(M):
    x,y = map(int,input().split(" "))
    arr[x].append(y)
    arr[y].append(x)


result = []
for i in range(1,N+1):
    q = deque([[i,0]])
    visit = [0] * (N+1)
    visit[i] = 1
    cnt = 0

    while q:
        v = q.popleft()
        cnt += v[1]

        for k in arr[v[0]] :
            if visit[k] == 0:
                visit[k] = 1
                q.append([k,v[1]+1])


    result.append([cnt,i])


result.sort()
print(result[0][1])