from collections import deque

N = int(input())

arr = [[0]*(N+1)]
for _ in range(N):
    arr.append([0] + list(map(int,input().split(" "))))

check = [[] for _ in range(N+1)]
for i in range(1,N+1):
    tmp = arr[i]
    for j in range(len(tmp)):
        if tmp[j] == 1 :
            check[i].append(j)


result = arr.copy()




for i in range(1,N+1):
    visit = [0] * (N + 1)
    q = deque(check[i])

    while q:
        v = q.popleft()
        for k in check[v]:
            if visit[k] == 0:
                visit[k] = 1
                result[i][k] = 1
                q.append(k)



for i in range(1,len(result)):
    for j in range(1, len(result)):
        print(result[i][j], end= " ")
    print()